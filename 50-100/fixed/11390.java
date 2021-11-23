public static org.alien4cloud.tosca.model.definitions.PropertyDefinition buildPropDef(java.lang.String type, org.alien4cloud.tosca.model.definitions.PropertyDefinition entrySchema, boolean required) {
    org.alien4cloud.tosca.model.definitions.PropertyDefinition propertyDefinition = new org.alien4cloud.tosca.model.definitions.PropertyDefinition();
    propertyDefinition.setType(type);
    propertyDefinition.setRequired(required);
    propertyDefinition.setPassword(false);
    propertyDefinition.setEntrySchema(entrySchema);
    return propertyDefinition;
}