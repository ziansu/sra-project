private static void initializeSMSApp() {
    final android.content.Intent mainIntent = new android.content.Intent(android.content.Intent.ACTION_MAIN, null);
    mainIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
    android.content.pm.PackageManager pm = com.anna.util.MyApplication.getAppContext().getPackageManager();
    final java.util.List<android.content.pm.ResolveInfo> pkgAppsList = pm.queryIntentActivities(mainIntent, 0);
    for (android.content.pm.ResolveInfo info : pkgAppsList) {
        com.anna.util.Module.supportedModuleNames.add(pm.getApplicationLabel(info.activityInfo.applicationInfo).toString());
    }
}