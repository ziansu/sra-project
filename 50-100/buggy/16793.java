private static java.lang.String getAppVersionString(android.content.Context context) {
    try {
        android.content.pm.PackageInfo myInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        return ((java.net.URLEncoder.encode(myInfo.versionName)) + "/") + (myInfo.versionCode);
    } catch (android.content.pm.PackageManager e) {
        return "<unknown>";
    }
}