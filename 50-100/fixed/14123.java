public static android.graphics.drawable.Drawable getUninstallApkIcon(android.content.Context context, java.lang.String apkPath) {
    android.content.res.Resources res = com.wfl.explorer.filetype.types.ApkType.getResource(context, apkPath);
    android.content.pm.PackageManager pm = context.getPackageManager();
    android.content.pm.PackageInfo info = pm.getPackageArchiveInfo(apkPath, PackageManager.GET_ACTIVITIES);
    if (info == null) {
        return null;
    }
    android.content.pm.ApplicationInfo appInfo = info.applicationInfo;
    if ((appInfo.icon) != 0) {
        android.graphics.drawable.Drawable icon = res.getDrawable(appInfo.icon);
        res.getAssets().close();
        return icon;
    }
    return null;
}