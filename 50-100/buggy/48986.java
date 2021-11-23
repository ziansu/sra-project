private java.lang.String addModelPrefix(java.lang.String swaggerType) {
    java.lang.String type = null;
    if (typeMapping.containsKey(swaggerType)) {
        type = typeMapping.get(swaggerType);
        if (languageSpecificPrimitives.contains(type))
            return type;
        
    }else
        type = "models." + swaggerType;
    
    return type;
}