private java.lang.reflect.Field getFieldByAnnotationValue(java.lang.Class<?> clazz, java.lang.String value) {
    java.util.List<java.lang.reflect.Field> fields = getAllDeclaredFields(clazz);
    for (java.lang.reflect.Field field : fields) {
        java.lang.annotation.Annotation[] annotations = field.getAnnotations();
        for (java.lang.annotation.Annotation annotation : annotations) {
            if ((annotation instanceof com.google.gson.annotations.SerializedName) && (value.equals(((com.google.gson.annotations.SerializedName) (annotation)).value()))) {
                return field;
            }
        }
    }
    return null;
}