@java.lang.Override
public java.lang.String getSwaggerType(io.swagger.models.properties.Property p) {
    java.lang.String swaggerType = super.getSwaggerType(p);
    java.lang.String type = null;
    if (typeMapping.containsKey(swaggerType)) {
        type = typeMapping.get(swaggerType);
        if ((languageSpecificPrimitives.contains(type)) || (defaultIncludes.contains(type)))
            return type;
        
    }else
        type = swaggerType;
    
    return toModelName(type);
}