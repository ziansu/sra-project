private static java.lang.String getApplicationMetaData(java.lang.String name) {
    try {
        android.content.pm.PackageManager packageManager = org.xwalk.core.XWalkEnvironment.sApplicationContext.getPackageManager();
        android.content.pm.ApplicationInfo appInfo = packageManager.getApplicationInfo(org.xwalk.core.XWalkEnvironment.sApplicationContext.getPackageName(), PackageManager.GET_META_DATA);
        java.lang.String value = appInfo.metaData.getString(name);
        if (value == null) {
            java.lang.Boolean boolValue = appInfo.metaData.getBoolean(name);
            if (boolValue != null) {
                value = (boolValue) ? "true" : "false";
            }
        }
        return value;
    } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException e) {
        return null;
    }
}