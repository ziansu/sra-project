public void addEntity(java.util.HashMap<java.lang.String, com.alvaromenezes.pojo.Entity> entities, com.fasterxml.jackson.databind.JsonNode node) {
    java.lang.String name = node.fields().next().getKey();
    name = com.alvaromenezes.controller.Util.fistUpperCase(name);
    if (!(entities.containsKey(name))) {
        com.alvaromenezes.pojo.Entity entity = new com.alvaromenezes.pojo.Entity(name);
        entities.put(name, entity);
        addAttributes(entities, node);
    }
}