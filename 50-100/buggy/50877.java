public static boolean isIdField(java.lang.reflect.Field iField) {
    com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    if (!(serializedSchema.classes.contains(iField.getDeclaringClass()))) {
        com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.registerClass(iField.getDeclaringClass());
    }
    return serializedSchema.fieldIds.containsValue(iField);
}