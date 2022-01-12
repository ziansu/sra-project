public static int getId(java.lang.String resourceName, java.lang.Class<?> c) {
    int id = -1;
    java.lang.reflect.Field idField;
    try {
        idField = c.getDeclaredField(resourceName);
        id = idField.getInt(idField);
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("mensaje: " + (e.getMessage())));
        java.lang.System.err.println(("resopurce name: " + resourceName));
    }
    return id;
}