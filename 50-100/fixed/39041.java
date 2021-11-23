public java.util.List<java.lang.String> deleteEntity(java.lang.String entityType, java.lang.String uniqueAttributeName, java.lang.String uniqueAttributeValue) throws org.apache.atlas.AtlasServiceException {
    org.apache.atlas.AtlasClient.API api = org.apache.atlas.AtlasClient.API.DELETE_ENTITY;
    com.sun.jersey.api.client.WebResource resource = getResource(api);
    resource = resource.queryParam(org.apache.atlas.AtlasClient.TYPE, entityType);
    resource = resource.queryParam(org.apache.atlas.AtlasClient.ATTRIBUTE_NAME, uniqueAttributeName);
    resource = resource.queryParam(org.apache.atlas.AtlasClient.ATTRIBUTE_VALUE, uniqueAttributeValue);
    org.codehaus.jettison.json.JSONObject jsonResponse = callAPIWithResource(org.apache.atlas.AtlasClient.API.DELETE_ENTITIES, resource, null);
    return extractResults(jsonResponse, org.apache.atlas.AtlasClient.GUID);
}