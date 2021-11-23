@java.lang.Override
public java.lang.String getSwaggerType(com.a24group.codegen.Property p) {
    java.lang.String swaggerType = super.getSwaggerType(p);
    java.lang.String type = null;
    if (typeMapping.containsKey(swaggerType)) {
        type = typeMapping.get(swaggerType);
        java.lang.System.out.println(("This be type: " + type));
        if (languageSpecificPrimitives.contains(type))
            return type;
        
    }else {
        type = initialCaps(swaggerType);
    }
    return type;
}