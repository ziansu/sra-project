public static java.lang.String getString(java.lang.Object from, java.lang.reflect.Field field) throws com.impetus.kundera.property.PropertyAccessException {
    com.impetus.kundera.property.PropertyAccessor<?> accessor = com.impetus.kundera.property.PropertyAccessorFactory.getPropertyAccessor(field);
    java.lang.Object object = com.impetus.kundera.property.PropertyAccessorHelper.getObject(from, field);
    return object != null ? accessor.toString() : null;
}