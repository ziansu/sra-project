public void testGetSuperclass() {
    assertEquals(java.lang.Object.class, dalvik.system.JniTest.envGetSuperclass(java.lang.String.class));
    assertEquals(null, dalvik.system.JniTest.envGetSuperclass(java.lang.Object.class));
    assertEquals(null, dalvik.system.JniTest.envGetSuperclass(int.class));
    assertEquals(null, dalvik.system.JniTest.envGetSuperclass(java.lang.Runnable.class));
}