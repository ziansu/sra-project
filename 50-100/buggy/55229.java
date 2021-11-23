private java.lang.String getContainerVersion() {
    java.lang.String version = null;
    try {
        android.content.pm.PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        version = pInfo.versionName;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        return version;
    }
}