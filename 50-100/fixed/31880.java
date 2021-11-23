private org.immutizer4j.ValidationResult validateType(java.lang.Class<?> type, org.immutizer4j.ValidationResult result) {
    java.lang.Class<?> current = type;
    while ((current != null) && (!(current.equals(java.lang.Object.class)))) {
        java.lang.reflect.Field[] fields = current.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            result = validateField(field, result);
        }
        current = current.getSuperclass();
    } 
    return result;
}