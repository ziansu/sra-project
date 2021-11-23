public static dev.xesam.android.kit.util.PackageUtils.Version getVersion(android.content.Context context) {
    dev.xesam.android.kit.util.PackageUtils.Version version = new dev.xesam.android.kit.util.PackageUtils.Version();
    try {
        android.content.pm.PackageManager pm = context.getPackageManager();
        android.content.pm.PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
        if (android.text.TextUtils.isEmpty(pi.versionName)) {
            version.versionName = pi.versionName;
        }
        version.versioncode = pi.versionCode;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return version;
}