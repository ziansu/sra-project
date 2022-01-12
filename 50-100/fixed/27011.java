private static java.lang.Object createMapOrCollection(java.lang.Class<?> targetCls, int initialSize) {
    try {
        java.lang.reflect.Constructor<?> ctor = targetCls.getConstructor(int.class);
        return ctor.newInstance(initialSize);
    } catch (java.lang.Exception e1) {
        try {
            java.lang.reflect.Constructor<?> ctor2 = targetCls.getConstructor();
            return ctor2.newInstance();
        } catch (java.lang.Exception e2) {
        }
    }
    return null;
}