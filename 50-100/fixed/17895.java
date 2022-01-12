private void addField(java.lang.String fieldName) {
    if ((rootClass) == null) {
        return ;
    }
    java.util.Map.Entry<java.lang.reflect.Field, java.lang.Object> fieldEntry = field(fieldName, rootClass);
    java.lang.Class<?> fieldType = getFieldType(fieldEntry.getKey());
    if (!(com.github.francofabio.vraptor.jackson.serialization.JacksonSerializer.isNonPojo(fieldType))) {
        includePrimitiveFields(fieldType, fieldName);
    }else {
        treeFields.addChild(fieldName);
    }
}