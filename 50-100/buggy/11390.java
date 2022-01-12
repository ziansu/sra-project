public static org.alien4cloud.tosca.model.definitions.PropertyDefinition buildPropDef(java.lang.String type, java.lang.String entrySchema, boolean required) {
    org.alien4cloud.tosca.model.definitions.PropertyDefinition propertyDefinition = new org.alien4cloud.tosca.model.definitions.PropertyDefinition();
    propertyDefinition.setType(type);
    propertyDefinition.setRequired(required);
    propertyDefinition.setPassword(false);
    propertyDefinition.setEntrySchema(org.alien4cloud.tosca.variable.PropertyDefinitionUtils.buildPropDef(entrySchema, true));
    return propertyDefinition;
}