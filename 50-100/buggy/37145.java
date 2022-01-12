@org.junit.Test
public void testCanLoadAddOnNotBefore() throws java.lang.Exception {
    org.zaproxy.zap.control.AddOn ao = new org.zaproxy.zap.control.AddOn("test-alpha-1.zap");
    assertTrue(ao.canLoadInVersion("2.4.0"));
    ao.setNotBeforeVersion("2.4.0");
    assertTrue(ao.canLoadInVersion("2.4.0"));
    assertTrue(ao.canLoadInVersion("2.5.0"));
    assertFalse(ao.canLoadInVersion("1.4.0"));
    assertFalse(ao.canLoadInVersion("2.0.alpha"));
}