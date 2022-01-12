public com.fasterxml.jackson.databind.JsonNode findPathwaysByXref(java.lang.String id, java.lang.String code) {
    java.lang.String wikiPathwaysResponse = uk.ac.ebi.metabolights.webservice.client.WikipathwaysWsClient.excuteRequest(getPathwaysUrlByXref(id, code), null, this.GET);
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    com.fasterxml.jackson.databind.JsonNode rootNode = null;
    try {
        rootNode = objectMapper.readTree(wikiPathwaysResponse);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    com.fasterxml.jackson.databind.JsonNode result = rootNode.path("result");
    return result;
}