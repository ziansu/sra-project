private com.google.gson.JsonObject parseView(java.lang.String dsDefinition) throws java.io.IOException {
    org.eclipse.dirigible.repository.api.IRepository repository = this.repository;
    org.eclipse.dirigible.repository.api.IResource resource = repository.getResource(((this.location) + dsDefinition));
    java.lang.String content = new java.lang.String(resource.getContent());
    com.google.gson.JsonParser parser = new com.google.gson.JsonParser();
    com.google.gson.JsonObject dsDefinitionObject = ((com.google.gson.JsonObject) (parser.parse(content)));
    return dsDefinitionObject;
}