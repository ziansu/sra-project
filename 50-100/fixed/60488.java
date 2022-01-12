private static sun.misc.Unsafe initUnsafe() {
    try {
        java.lang.Class<?> unsafeClass = sun.misc.Unsafe.class;
        java.lang.reflect.Field theUnsafe = unsafeClass.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        return ((sun.misc.Unsafe) (theUnsafe.get(null)));
    } catch (java.lang.NoSuchFieldException | java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    return null;
}