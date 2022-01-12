private void getCurVersion() {
    try {
        android.content.pm.PackageInfo pInfo = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0);
        curVersion = pInfo.versionName;
        curVersionCode = pInfo.versionCode;
    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
        android.util.Log.e("update", e.getMessage());
    } catch (java.lang.Exception e) {
        android.util.Log.e("update", e.getMessage());
    }
}