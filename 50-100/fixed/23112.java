private java.lang.String[] getMultiPermissionNameAsString(java.util.ArrayList<payment.unopay.in.permissionmodule.Permission> permissions) {
    java.lang.String[] permissionArray = new java.lang.String[permissions != null ? permissions.size() : 0];
    int index = 0;
    if (permissions != null) {
        for (payment.unopay.in.permissionmodule.Permission permission : permissions) {
            permissionArray[(index++)] = permission.getName();
        }
    }
    return permissionArray;
}