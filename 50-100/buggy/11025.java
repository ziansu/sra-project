@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    for (int i = 0; i < (mReceivedPermissions.length); i++) {
        java.lang.String permission = mReceivedPermissions[i];
        int result = mReceivedPermissionsResults[i];
        io.jasonatwood.permissionmanager.PermissionManager.onPermissionResponse(permission, result);
    }
}