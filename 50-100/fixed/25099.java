@org.junit.Test
public void testFindClass_classFound() throws java.lang.Exception {
    java.lang.Class<?> c = _findClass(mFrameworkClassLoader, "jar.example.Class2");
    assertEquals("jar.example.Class2", c.getName());
    java.util.HashMap<java.lang.String, java.lang.Class<?>> map = getPrivateClassCache();
    assertTrue(map.containsKey("jar.example.Class1"));
    assertTrue(map.containsKey("jar.example.Class2"));
    assertEquals(2, map.size());
}