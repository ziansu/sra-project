public java.lang.String getCarrierPackageNameForBroadcastIntent(android.content.pm.PackageManager packageManager, android.content.Intent intent) {
    java.util.List<android.content.pm.ResolveInfo> receivers = packageManager.queryBroadcastReceivers(intent, 0);
    for (android.content.pm.ResolveInfo resolveInfo : receivers) {
        if ((resolveInfo.activityInfo) == null) {
            continue;
        }
        java.lang.String packageName = resolveInfo.activityInfo.packageName;
        if ((getCarrierPrivilegeStatus(packageManager, packageName)) == (android.telephony.TelephonyManager.CARRIER_PRIVILEGE_STATUS_HAS_ACCESS)) {
            return packageName;
        }
    }
    return null;
}