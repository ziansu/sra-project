private static java.lang.Object castResult(java.lang.Object result) {
    com.fasterxml.jackson.databind.JsonNode node = org.rabix.common.helper.JSONHelper.readJsonNode(result.toString());
    return org.rabix.common.helper.JSONHelper.transform(node, false);
}