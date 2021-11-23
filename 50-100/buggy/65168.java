public static java.util.List<java.lang.reflect.Field> getFields(java.lang.Class clazz, boolean recursive) {
    java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList();
    fields.addAll(java.util.Arrays.asList(clazz.getDeclaredFields()));
    if (recursive) {
        java.lang.Class targetClass = clazz;
        while ((targetClass != null) && (targetClass != (java.lang.Object.class))) {
            targetClass = targetClass.getSuperclass();
            fields.addAll(java.util.Arrays.asList(targetClass.getDeclaredFields()));
        } 
    }
    return fields;
}