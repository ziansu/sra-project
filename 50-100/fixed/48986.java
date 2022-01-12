private java.lang.String addModelPrefix(java.lang.String swaggerType) {
    java.lang.String type = null;
    if (typeMapping.containsKey(swaggerType)) {
        type = typeMapping.get(swaggerType);
    }else {
        type = swaggerType;
    }
    if (!(languageSpecificPrimitives.contains(type))) {
        type = "models." + swaggerType;
    }
    return type;
}