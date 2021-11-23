private void doChangePhone() {
    if ((mVpnProfile) != null) {
        disconnect(mVpnProfile);
        connect(mVpnProfile);
    }
    if (((mRemoveAppList) != null) && (!(mRemoveAppList.isEmpty()))) {
        for (android.content.pm.PackageInfo packageInfo : mRemoveAppList) {
            uninstallPkg(packageInfo.packageName);
        }
    }
}