protected void assertUtilsClass(java.lang.Class<?> c) {
    java.lang.reflect.Constructor ctor = null;
    try {
        ctor = c.getDeclaredConstructor();
    } catch (java.lang.NoSuchMethodException e) {
        fail(("No default constructor defined for class " + (c.getCanonicalName())));
    }
    assertTrue(java.lang.reflect.Modifier.isPrivate(ctor.getModifiers()));
    ctor.setAccessible(true);
    try {
        java.lang.Object o = ctor.newInstance();
    } catch (java.lang.ReflectiveOperationException e) {
        fail("Unable to instantiate!");
    }
}