static boolean isDebug(android.content.Context context) {
    return 0 != (context.getApplicationContext().getApplicationInfo().flags &= android.content.pm.ApplicationInfo.FLAG_DEBUGGABLE);
}