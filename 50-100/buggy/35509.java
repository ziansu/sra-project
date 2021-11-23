private static boolean neededPackagesExist(android.content.Context context) {
    final android.content.pm.PackageManager pm = context.getPackageManager();
    boolean androidScriptingExists = false;
    boolean pythonForAndroidExists = false;
    java.util.List<android.content.pm.ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
    for (android.content.pm.ApplicationInfo packageInfo : packages) {
        if (packageInfo.packageName.equalsIgnoreCase("com.googlecode.android_scripting")) {
            androidScriptingExists = true;
        }
        if (packageInfo.packageName.equalsIgnoreCase("com.googlecode.pythonforandroid")) {
            pythonForAndroidExists = true;
        }
    }
    return androidScriptingExists & pythonForAndroidExists;
}