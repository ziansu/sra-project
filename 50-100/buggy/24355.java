public java.util.ArrayList<biocode.fims.digester.Entity> getEntititesWithAttributeUri(java.lang.String uri) {
    java.util.ArrayList<biocode.fims.digester.Entity> entities = new java.util.ArrayList<>();
    for (biocode.fims.digester.Entity entity : entities) {
        for (biocode.fims.digester.Attribute attribute : entity.getAttributes()) {
            if (attribute.getUri().equals(uri)) {
                entities.add(entity);
            }
        }
    }
    return entities;
}