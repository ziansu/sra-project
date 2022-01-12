public static java.lang.Class<?> getSerializedType(final java.lang.reflect.Field iField) {
    final com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    if (serializedSchema == null)
        return null;
    
    if (!(serializedSchema.classes.contains(iField.getDeclaringClass())))
        com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.registerCallbacks(iField.getDeclaringClass());
    
    return (serializedSchema.serializedFields.get(iField.getDeclaringClass())) != null ? serializedSchema.serializedFields.get(iField.getDeclaringClass()).get(iField) : null;
}