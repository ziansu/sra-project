public static void main(java.lang.String[] args) {
    stall_till_cloudsize(1);
    try {
        new water.OOMTest().testParseMemoryStress();
    } catch (java.lang.Throwable e) {
        water.util.Log.err(e);
        java.io.StringWriter sw = new java.io.StringWriter();
        e.printStackTrace(new java.io.PrintWriter(sw));
        water.util.Log.err(sw);
        java.lang.System.exit((-1));
    }
    java.lang.System.exit(0);
}