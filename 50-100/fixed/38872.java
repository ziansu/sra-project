@java.lang.Override
protected java.lang.String call() throws java.lang.Exception {
    try {
        start = new com.googlecode.e2u.Start();
        return start.start(args, false, false);
    } catch (java.lang.Exception e1) {
        java.util.logging.Logger.getLogger(this.getClass().getCanonicalName()).log(java.util.logging.Level.SEVERE, "Failed to load server.", e1);
    }
    return null;
}