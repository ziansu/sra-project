@org.junit.Test
public void testPreLoadClasses_classNotFound() throws java.lang.Exception {
    mFrameworkClassLoader.preLoadClasses("not.a.package.", null, null);
    java.util.HashMap<java.lang.String, java.lang.Class<?>> map = getPrivateClassCache();
    assertEquals(0, map.size());
    java.util.HashMap<java.lang.String, byte[]> data = getPrivateEntryCache();
    assertEquals(0, data.size());
}