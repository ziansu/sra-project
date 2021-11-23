private static <T> java.lang.Long insertNestedObject(no.hyper.memoryorm.DbManager db, T entity, no.hyper.memoryorm.model.Column column, android.content.Context context) throws java.io.IOException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
    java.lang.reflect.Field field = entity.getClass().getDeclaredField(column.getLabel());
    field.setAccessible(true);
    java.lang.Object actualObject = field.get(entity);
    if (actualObject == null)
        return -1L;
    
    return no.hyper.memoryorm.operation.InsertOperation.insert(db, context, actualObject, null);
}