@org.junit.Test
public void testInvalidAutoRefreshTimeArg() {
    java.lang.String[] args = new java.lang.String[]{ "-autorefresh4" };
    cla.setCommandLineArgs(args);
    org.junit.Assert.assertEquals(0, cla.getAutoRefreshTime());
}