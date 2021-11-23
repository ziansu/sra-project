public <T> com.google.gson.TypeAdapterFactory getDelegateAdapterFactory(com.google.gson.reflect.TypeToken<T> targetType) {
    java.lang.Class<?> annotatedClass = targetType.getRawType();
    com.google.gson.annotations.JsonAdapter annotation = annotatedClass.getAnnotation(com.google.gson.annotations.JsonAdapter.class);
    if (annotation == null) {
        return null;
    }
    return getTypeAdapterFactory(annotatedClass, annotation, constructorConstructor);
}