public void askForPermission(android.app.Activity activity, java.lang.String[] permissions, org.gem.indo.dooit.helpers.permissions.PermissionCallback permissionCallback) {
    if (permissionCallback == null) {
        return ;
    }
    if (org.gem.indo.dooit.helpers.permissions.PermissionsHelper.needPermission(activity, permissions)) {
        permissionCallback.permissionGranted();
        return ;
    }
    org.gem.indo.dooit.helpers.permissions.PermissionRequest permissionRequest = new org.gem.indo.dooit.helpers.permissions.PermissionRequest(new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(permissions)), permissionCallback);
    org.gem.indo.dooit.helpers.permissions.PermissionsHelper.permissionRequests.add(permissionRequest);
    android.support.v4.app.ActivityCompat.requestPermissions(activity, permissions, permissionRequest.getRequestCode());
}