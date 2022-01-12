private boolean isActivityAvailable(android.content.Context context, java.lang.String packageName, java.lang.String className) {
    final android.content.pm.PackageManager packageManager = context.getPackageManager();
    final android.content.Intent intent = new android.content.Intent();
    intent.setClassName(packageName, className);
    @java.lang.SuppressWarnings(value = "rawtypes")
    java.util.List list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
    return (list.size()) > 0;
}