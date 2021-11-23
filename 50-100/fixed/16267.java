public <A extends java.lang.annotation.Annotation> A getAttributeOrRelationAnnotation(java.lang.Class<?> entityClass, java.lang.Class<A> annotationClass, java.lang.String identifier) {
    java.lang.reflect.AccessibleObject fieldOrMethod = getEntityBinding(entityClass).fieldsToValues.get(identifier);
    if (fieldOrMethod == null) {
        return null;
    }
    return fieldOrMethod.getAnnotation(annotationClass);
}