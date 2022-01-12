public static java.lang.String getAppMetaData(android.content.Context context, java.lang.String Key) {
    java.lang.String value = null;
    try {
        android.content.pm.ApplicationInfo appInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
        value = appInfo.metaData.getString(Key);
    } catch (android.content.pm.PackageManager e) {
        e.printStackTrace();
    }
    return value;
}