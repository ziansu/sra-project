public static int getId(java.lang.String resourceName, java.lang.Class<?> c) {
    try {
        java.lang.reflect.Field idField = c.getDeclaredField(resourceName);
        return idField.getInt(idField);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(((("No resource ID found for: " + resourceName) + " / ") + c), e);
    }
}