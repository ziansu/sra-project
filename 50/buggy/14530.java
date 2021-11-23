@org.junit.Test
public void testServiceFlags() {
    org.mycore.mods.MCRMODSWrapper wrapper = new org.mycore.mods.MCRMODSWrapper();
    org.junit.Assert.assertNull(wrapper.getServiceFlag("name"));
    wrapper.setServiceFlag("name", "value");
    org.junit.Assert.assertEquals("value", wrapper.getServiceFlag("name"));
}