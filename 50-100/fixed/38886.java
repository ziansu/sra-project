@org.junit.Test
public void testEmptyArgs() {
    java.lang.String[] args = new java.lang.String[]{  };
    cla.setCommandLineArgs(args);
    org.junit.Assert.assertEquals("config.properties", cla.getConfigFile());
    org.junit.Assert.assertEquals(false, cla.getEncrypt());
    org.junit.Assert.assertEquals(false, cla.isNoGUI());
    org.junit.Assert.assertEquals(0, cla.getAutoRefreshTime());
}