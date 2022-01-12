private static void assertExceptionContains(java.lang.Throwable t, java.lang.String substring) {
    java.lang.String msg = org.apache.hadoop.util.StringUtils.stringifyException(t);
    assertTrue(((("Exception should contain substring '" + substring) + "\':\n") + msg), msg.contains(substring));
    org.apache.hadoop.ipc.TestIPC.LOG.info("Got expected exception", t);
}