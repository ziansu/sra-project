public static java.lang.reflect.Field getAllDeclaredField(java.lang.String name, java.lang.Class clazz) throws java.lang.NoSuchFieldException {
    java.lang.Class currentClass = clazz;
    while (currentClass != null) {
        try {
            java.lang.reflect.Field f = currentClass.getDeclaredField(name);
            return f;
        } catch (java.lang.NoSuchFieldException e) {
        }
        currentClass = currentClass.getSuperclass();
    } 
    throw new java.lang.NoSuchFieldException(name);
}