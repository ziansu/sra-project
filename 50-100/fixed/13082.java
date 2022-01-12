@java.lang.Override
protected java.lang.Object newInstanceForClass(java.lang.String className) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.Class<?> clss = java.lang.Class.forName(className);
    try {
        java.lang.reflect.Constructor<?> cons = clss.getConstructor(android.content.Context.class);
        return cons.newInstance(androidContext);
    } catch (java.lang.NoSuchMethodException nsme) {
    } catch (java.lang.reflect.InvocationTargetException ite) {
    }
    return clss.newInstance();
}