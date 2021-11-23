static int map(com.cronutils.model.field.value.FieldValue fieldValue) {
    if (fieldValue instanceof com.cronutils.model.field.value.IntegerFieldValue) {
        return ((com.cronutils.model.field.value.IntegerFieldValue) (fieldValue)).getValue();
    }
    throw new java.lang.RuntimeException("Non integer values at intervals are not fully supported yet.");
}