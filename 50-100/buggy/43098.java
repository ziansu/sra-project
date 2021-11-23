public static java.lang.reflect.Method getAllDeclaredMethod(java.lang.String name, java.lang.Class[] params, java.lang.Class clazz) throws java.lang.NoSuchMethodException {
    java.lang.Class currentClass = clazz;
    while (currentClass != null) {
        try {
            java.lang.reflect.Method m = currentClass.getDeclaredMethod(name, params);
            return m;
        } catch (java.lang.NoSuchMethodException e) {
        }
        currentClass = clazz.getSuperclass();
    } 
    throw new java.lang.NoSuchMethodException(name);
}