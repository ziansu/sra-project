public static boolean isSerializedType(final java.lang.reflect.Field iField) {
    final com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    if (serializedSchema == null)
        return false;
    
    if (!(serializedSchema.classes.contains(iField.getDeclaringClass())))
        com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.registerCallbacks(iField.getDeclaringClass());
    
    java.util.Map<java.lang.reflect.Field, java.lang.Class<?>> serializerFields = serializedSchema.serializedFields.get(iField.getDeclaringClass());
    return (serializerFields != null) && ((serializerFields.get(iField)) != null);
}