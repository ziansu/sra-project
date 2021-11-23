@java.lang.Override
protected java.lang.Boolean checkPermission(java.lang.Boolean value) {
    if (!value)
        return null;
    
    if (checkRequestPermission(PermissionManager.READ_PHONE_STATE))
        return null;
    
    return false;
}