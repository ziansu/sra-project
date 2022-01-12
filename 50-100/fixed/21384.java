private java.lang.reflect.Field findField(java.lang.Class objectClass, java.lang.Class fieldClass, java.lang.String expectedName) {
    try {
        java.lang.reflect.Field field = objectClass.getDeclaredField(expectedName);
        field.setAccessible(true);
        return field;
    } catch (java.lang.NoSuchFieldException e) {
    }
    for (java.lang.reflect.Field searchField : objectClass.getDeclaredFields()) {
        if ((searchField.getType()) == fieldClass) {
            searchField.setAccessible(true);
            return searchField;
        }
    }
    return null;
}