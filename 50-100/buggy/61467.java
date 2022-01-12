private void setupRequiredProperty() {
    com.serotonin.bacnet4j.type.enumerated.ObjectType ot = objectId.getObjectType();
    java.util.List<com.serotonin.bacnet4j.obj.PropertyTypeDefinition> defs = com.serotonin.bacnet4j.obj.ObjectProperties.getPropertyTypeDefinitions(ot);
    java.lang.System.out.println(("Required properties: " + (defs.size())));
    for (com.serotonin.bacnet4j.obj.PropertyTypeDefinition def : defs) {
        java.lang.System.out.println((((def.getClazz()) + " : ") + (def.getPropertyIdentifier())));
        initializeRequiredProperty(def);
    }
    bacnet.LocalBacnetPoint.LOGGER.info("all properties are set up");
}