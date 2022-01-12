private com.google.gson.JsonObject parseExtension(java.lang.String dsDefinition) throws java.io.IOException {
    org.eclipse.dirigible.repository.api.IRepository repository = this.repository;
    org.eclipse.dirigible.repository.api.IResource resource = repository.getResource(dsDefinition);
    java.lang.String content = new java.lang.String(resource.getContent(), org.eclipse.dirigible.repository.api.ICommonConstants.UTF8);
    com.google.gson.JsonParser parser = new com.google.gson.JsonParser();
    com.google.gson.JsonObject dsDefinitionObject = ((com.google.gson.JsonObject) (parser.parse(content)));
    return dsDefinitionObject;
}