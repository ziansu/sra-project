public com.box.sdk.Metadata getMetadata(java.lang.String typeName) {
    java.lang.String scope = this.scopeBasedOnType(typeName);
    java.net.URL url = com.box.sdk.BoxFile.METADATA_URL_TEMPLATE.build(this.getAPI().getBaseURL(), this.getID(), scope, typeName);
    com.box.sdk.BoxAPIRequest request = new com.box.sdk.BoxAPIRequest(this.getAPI(), url, "GET");
    com.box.sdk.BoxJSONResponse response = ((com.box.sdk.BoxJSONResponse) (request.send()));
    return new com.box.sdk.Metadata(com.eclipsesource.json.JsonObject.readFrom(response.getJSON()));
}