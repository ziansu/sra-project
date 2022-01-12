@com.android.internal.annotations.VisibleForTesting
protected boolean inSystemImage(int callerUid) {
    java.lang.String[] packages = mContext.getPackageManager().getPackagesForUid(callerUid);
    for (java.lang.String name : packages) {
        try {
            android.content.pm.PackageInfo packageInfo = mContext.getPackageManager().getPackageInfo(name, 0);
            if (((packageInfo.applicationInfo.flags) & (ApplicationInfo.FLAG_SYSTEM)) != 0) {
                return true;
            }
        } catch (android.content.pm.PackageManager e) {
            return false;
        }
    }
    return false;
}