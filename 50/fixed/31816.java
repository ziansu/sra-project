public static play.mvc.Result getSimilarColumnComments(java.lang.Long datasetId, int columnId) {
    com.fasterxml.jackson.databind.node.ObjectNode result = play.libs.Json.newObject();
    result.put("similar", play.libs.Json.toJson(dao.DatasetsDAO.similarColumnComments(datasetId, columnId)));
    return ok(result);
}