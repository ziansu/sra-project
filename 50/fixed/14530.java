@org.junit.Test
public void testServiceFlags() {
    org.mycore.mods.MCRMODSWrapper wrapper = new org.mycore.mods.MCRMODSWrapper();
    assertNull(wrapper.getServiceFlag("name"));
    wrapper.setServiceFlag("name", "value");
    assertEquals("value", wrapper.getServiceFlag("name"));
}