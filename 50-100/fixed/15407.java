@java.lang.Override
public void onPermissionsGranted(int requestCode, java.util.List<java.lang.String> perms) {
    if ((requestCode == (com.openwudi.animal.activity.UpActivity.REQ_PERMISSION)) && ((perms.size()) >= (mPerms.length))) {
        if (com.blankj.utilcode.utils.NetworkUtils.isConnected(mContext)) {
            presenter.gps();
        }else {
            presenter.gps();
        }
    }
}