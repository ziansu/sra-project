public void testRootPropertiesPersistAfterFormat() throws java.lang.Exception {
    org.apache.ignite.internal.processors.igfs.IgfsAbstractSelfTest.igfs.update(new org.apache.ignite.igfs.IgfsPath("/"), java.util.Collections.singletonMap("foo", "moo"));
    org.apache.ignite.internal.processors.igfs.IgfsAbstractSelfTest.igfs.format();
    org.apache.ignite.igfs.IgfsFile file = org.apache.ignite.internal.processors.igfs.IgfsAbstractSelfTest.igfs.info(new org.apache.ignite.igfs.IgfsPath("/"));
    assert file != null;
    java.util.Map<java.lang.String, java.lang.String> props = file.properties();
    assertEquals("moo", props.get("foo"));
}