private com.dynamicload.framework.dynamicload.internal.DLPluginPackage getPluginPackageByBundle(java.lang.String bundleName) {
    android.content.Context context = com.dynamicload.framework.util.FrameworkUtil.getContext();
    java.lang.String apkPath = com.dynamicload.framework.util.FrameworkUtil.getApkPathByBundleName(bundleName);
    if (android.text.TextUtils.isEmpty(apkPath)) {
        android.util.Log.e(com.dynamicload.framework.framework.MicroApplicationContextImpl.TAG, "bundleName error.");
        return null;
    }
    android.content.pm.PackageInfo info = com.dynamicload.framework.dynamicload.utils.DLUtils.getPackageInfo(context, apkPath);
    if (info == null) {
        return null;
    }
    return com.dynamicload.framework.dynamicload.internal.DLPluginManager.getInstance(context).getPackage(info.packageName);
}