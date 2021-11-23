public java.lang.String getCarrierPackageNameForBroadcastIntent(android.content.pm.PackageManager packageManager, android.content.Intent intent) {
    return (mCarrierPrivilegeRules) == null ? "" : mCarrierPrivilegeRules.getCarrierPackageNameForBroadcastIntent(packageManager, intent);
}