@java.lang.Override
protected java.lang.Boolean checkPermission(java.lang.Boolean value) {
    if (!value)
        return null;
    
    return checkRequestPermission(PermissionManager.READ_PHONE_STATE);
}