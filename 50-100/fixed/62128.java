private java.lang.String checkPermission(java.lang.String permissionName) {
    final android.content.pm.PackageManager pm = mContext.getPackageManager();
    if ((pm.checkPermission(permissionName, mContext.getPackageName())) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        com.microsoft.aad.adal.Logger.w(com.microsoft.aad.adal.BrokerProxy.TAG, ("Broker related permissions are missing for " + permissionName), "", ADALError.DEVELOPER_BROKER_PERMISSIONS_MISSING);
        return permissionName + ' ';
    }
    return "";
}