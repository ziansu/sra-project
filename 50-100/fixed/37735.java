public static java.lang.Object getNonPublicInstance(java.lang.String name) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    java.lang.Class<?> c = java.lang.Class.forName(name);
    java.lang.reflect.Constructor<?> constructor = c.getDeclaredConstructor();
    constructor.setAccessible(true);
    return constructor.newInstance(((java.lang.Object[]) (null)));
}