public static java.util.List<java.lang.String> getClassFields(final java.lang.Class<?> iClass) {
    final com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    if (serializedSchema == null)
        return null;
    
    return serializedSchema.allFields.get(iClass);
}