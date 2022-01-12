public void exception(final java.lang.Throwable t) {
    final int level = android.util.Log.ERROR;
    log(level, com.google.common.base.Throwables.getStackTraceAsString(t));
}