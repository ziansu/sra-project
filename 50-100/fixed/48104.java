private static java.lang.String getApplicationMetaData(java.lang.String name) {
    try {
        android.content.pm.PackageManager packageManager = org.xwalk.core.XWalkEnvironment.sApplicationContext.getPackageManager();
        android.content.pm.ApplicationInfo appInfo = packageManager.getApplicationInfo(org.xwalk.core.XWalkEnvironment.sApplicationContext.getPackageName(), PackageManager.GET_META_DATA);
        return appInfo.metaData.get(name).toString();
    } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException e) {
        return null;
    }
}