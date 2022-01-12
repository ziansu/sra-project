public void set(java.lang.String var, java.lang.String value) {
    try {
        interpreter.set(var, value);
    } catch (java.lang.Exception e) {
        au.org.intersect.faims.android.log.FLog.i("error executing code", e);
        showWarning("Logic Error", "Error encountered in logic script");
    }
}