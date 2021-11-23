private boolean isUidIdle(int uid) {
    final java.lang.String[] packages = mContext.getPackageManager().getPackagesForUid(uid);
    final int userId = android.os.UserHandle.getUserId(uid);
    for (java.lang.String packageName : packages) {
        if (!(mUsageStats.isAppIdle(packageName, uid, userId))) {
            return false;
        }
    }
    return true;
}