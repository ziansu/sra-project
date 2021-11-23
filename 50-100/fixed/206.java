protected static void addCascadeDeleteField(final java.lang.Class<?> currentClass, final java.lang.String fieldName) {
    final com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    if (serializedSchema == null)
        return ;
    
    java.util.List<java.lang.String> classCascadeDeleteFields = serializedSchema.cascadeDeleteFields.get(currentClass);
    if (classCascadeDeleteFields == null)
        classCascadeDeleteFields = new java.util.ArrayList<java.lang.String>();
    
    classCascadeDeleteFields.add(fieldName);
    serializedSchema.cascadeDeleteFields.put(currentClass, classCascadeDeleteFields);
}