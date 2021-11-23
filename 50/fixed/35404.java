private static void abort(java.lang.Throwable t) throws java.lang.Throwable {
    try {
        java.lang.System.exit(1);
    } catch (java.lang.SecurityException ignored) {
    }
    throw t;
}