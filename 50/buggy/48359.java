public void exception(final java.io.IOException e) {
    final int level = android.util.Log.ERROR;
    log(level, com.google.common.base.Throwables.getStackTraceAsString(e));
}