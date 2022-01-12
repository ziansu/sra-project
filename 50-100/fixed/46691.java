private java.lang.String getVersionNameLocal(android.content.Context context) {
    org.apache.cordova.LOG.d(TAG, "get version name..");
    java.lang.String versionName = "0";
    try {
        versionName = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
        e.printStackTrace();
    }
    return versionName;
}