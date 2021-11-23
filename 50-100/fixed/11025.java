@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mReceivedPermissions) == null) {
        return ;
    }
    for (int i = 0; i < (mReceivedPermissions.length); i++) {
        java.lang.String permission = mReceivedPermissions[i];
        int result = mReceivedPermissionsResults[i];
        io.jasonatwood.permissionmanager.PermissionManager.onPermissionResponse(permission, result);
    }
}