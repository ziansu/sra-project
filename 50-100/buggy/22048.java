private void checkIdOrganizationsValid(java.lang.String req) throws com.fasterxml.jackson.core.JsonProcessingException, it.sinergis.datacatalogue.exception.DCException, java.io.IOException, java.lang.NumberFormatException {
    com.fasterxml.jackson.databind.node.ArrayNode orgs = ((com.fasterxml.jackson.databind.node.ArrayNode) (om.readTree(req).path(Constants.ORGANIZATIONS_FIELD)));
    for (com.fasterxml.jackson.databind.JsonNode org : orgs) {
        checkIdOrganizationValid(om.writeValueAsString(org));
    }
}