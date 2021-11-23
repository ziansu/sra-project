public void createDefinitionBySchemaAndPackageIfNotExists(java.lang.String schema, java.lang.String packageName, com.spirit21.swagger.converter.models.Definition rootDefinition) throws com.spirit21.swagger.converter.parsers.ParserException {
    java.lang.String className = schema.substring(14);
    com.spirit21.swagger.converter.models.Definition definition = getDefinitionByClassName(className);
    if (definition == null) {
        java.util.List<java.lang.String> imports = new java.util.ArrayList<>();
        imports.add(packageName);
        definitions.add(createDefinitionByClassName(className, imports, "", rootDefinition));
    }
}