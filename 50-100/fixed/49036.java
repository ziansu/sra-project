private static java.lang.Class<?> GetMainActivityClassName(android.content.Context context) throws java.lang.ClassNotFoundException {
    java.lang.String packageName = context.getPackageName();
    android.content.Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(packageName);
    java.lang.String className = launchIntent.getComponent().getClassName();
    return java.lang.Class.forName(className);
}