private void checkPermission() {
    if (!(pub.devrel.easypermissions.EasyPermissions.hasPermissions(this, mPerms))) {
        pub.devrel.easypermissions.EasyPermissions.requestPermissions(this, "需要相关权限, 否则无法运行", com.openwudi.animal.activity.UpActivity.REQ_PERMISSION, mPerms);
    }else {
        if (com.blankj.utilcode.utils.NetworkUtils.isConnected(mContext)) {
            presenter.gps();
        }else {
            startGpsWithoutNetwork();
        }
    }
}