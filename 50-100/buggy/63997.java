private static boolean isEmbeddedObject(java.lang.reflect.Field f) {
    com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    if (!(serializedSchema.classes.contains(f.getDeclaringClass())))
        com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.registerClass(f.getDeclaringClass());
    
    return com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.isEmbeddedField(f.getDeclaringClass(), f.getName());
}