private static java.lang.Object instantiate(java.lang.reflect.Constructor<?> constructor, java.lang.Object... arguments) {
    try {
        return constructor.newInstance(arguments);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    }
    return null;
}