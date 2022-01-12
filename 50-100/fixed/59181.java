@ru.test.GET
@ru.test.Path(value = "/node/find/{query}/page/{page : \\d+}")
public javax.ws.rs.core.Response findNodes(@ru.test.PathParam(value = "query")
java.lang.String query, @ru.test.PathParam(value = "page")
long page) {
    if ((query.isEmpty()) || (page < 0)) {
        return getError(400);
    }
    java.util.List<ru.test.entities.Node> nodes = catalogService.findNodes(query, page);
    if (nodes == null) {
        return getError(404);
    }
    return getSuccess(nodes);
}