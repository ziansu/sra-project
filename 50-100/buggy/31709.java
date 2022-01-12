public void testFileClassloader() {
    org.jruby.util.FileResource resource = org.jruby.util.URLResource.create(((org.jruby.Ruby) (null)), "uri:classloader:/somedir/.jrubydir", false);
    assertNotNull(resource);
    assertTrue(resource.isFile());
    assertTrue(resource.exists());
    assertFalse(resource.isDirectory());
    assertNull(resource.list());
}