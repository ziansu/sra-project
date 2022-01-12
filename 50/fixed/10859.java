@java.lang.Override
public void onClick(android.view.View v) {
    com.zhangwx.dynamicpermissionsrequest.permission.EasyPermissions.requestPermissions(this, R.mipmap.ic_launcher, "RequestLocationPermissions", getString(R.string.action_settings), PermissionUtils.REQUEST_CONTACTS_CODE, PermissionUtils.PERMISSIONS_CONTACTS_GROUP);
}