@java.lang.Override
public java.lang.String getSwaggerType(io.swagger.models.properties.Property p) {
    java.lang.String swaggerType = super.getSwaggerType(p);
    java.lang.String type = null;
    if (typeMapping.containsKey(swaggerType)) {
        type = typeMapping.get(swaggerType);
        if (languageSpecificPrimitives.contains(type))
            return type;
        
    }else {
        type = initialCaps(swaggerType);
    }
    return type;
}