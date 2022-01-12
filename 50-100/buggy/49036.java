private static java.lang.Class<?> GetMainActivityClassName(android.content.Context context) throws java.lang.ClassNotFoundException {
    java.lang.String packageName = context.getPackageName();
    android.content.Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(packageName);
    java.lang.String className = launchIntent.getComponent().getClassName();
    try {
        return java.lang.Class.forName(className);
    } catch (java.lang.ClassNotFoundException e) {
        android.util.Log.e(net.agasper.unitynotification.UnityNotificationManager.class.getSimpleName(), android.util.Log.getStackTraceString(e));
        throw e;
    }
}