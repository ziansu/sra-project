@ru.test.GET
@ru.test.Path(value = "/node/find/page/{page : \\d+}")
public javax.ws.rs.core.Response find(@ru.test.QueryParam(value = "query")
java.lang.String text, @ru.test.PathParam(value = "page")
long page) {
    if ((text.isEmpty()) || (page < 0)) {
        return getError(400);
    }
    java.util.List<ru.test.entities.Node> nodes = catalogService.findNodes(text, page);
    if (nodes == null) {
        return getError(404);
    }
    return getSuccess(nodes);
}