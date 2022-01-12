private static java.lang.reflect.Field findField(java.lang.Class classType, java.lang.String fieldName, java.lang.Class fieldType) {
    for (java.lang.reflect.Field field : classType.getDeclaredFields()) {
        if (field.getName().equals(fieldName)) {
            if (((fieldType != null) && (field.getType().isAssignableFrom(fieldType))) || ((fieldType == null) && (field.getType().isPrimitive()))) {
                return field;
            }
        }
    }
    return null;
}