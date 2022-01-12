private void setupRequiredProperty() {
    com.serotonin.bacnet4j.type.enumerated.ObjectType ot = objectId.getObjectType();
    java.util.List<com.serotonin.bacnet4j.obj.PropertyTypeDefinition> defs = com.serotonin.bacnet4j.obj.ObjectProperties.getPropertyTypeDefinitions(ot);
    for (com.serotonin.bacnet4j.obj.PropertyTypeDefinition def : defs) {
        initializeRequiredProperty(def);
    }
}