protected static void addCascadeDeleteField(java.lang.Class<?> currentClass, final java.lang.String fieldName) {
    com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    java.util.List<java.lang.String> classCascadeDeleteFields = serializedSchema.cascadeDeleteFields.get(currentClass);
    if (classCascadeDeleteFields == null)
        classCascadeDeleteFields = new java.util.ArrayList<java.lang.String>();
    
    classCascadeDeleteFields.add(fieldName);
    serializedSchema.cascadeDeleteFields.put(currentClass, classCascadeDeleteFields);
}