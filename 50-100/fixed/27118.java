public static int getId(java.lang.String resourceName, java.lang.Class<?> c) {
    try {
        java.lang.reflect.Field idField = c.getDeclaredField(resourceName);
        return idField.getInt(idField);
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("No resource ID found for: " + resourceName));
        return -1;
    }
}