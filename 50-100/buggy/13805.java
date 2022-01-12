private void recurseImpliedPermissions(com.hypersocket.permissions.PermissionType t, java.util.Set<com.hypersocket.permissions.PermissionType> derivedPermissions) {
    if (!(derivedPermissions.contains(t))) {
        com.hypersocket.permissions.PermissionServiceImpl.log.info(("REMOVEME: " + (t.getResourceKey())));
        derivedPermissions.add(t);
        if ((t.impliesPermissions()) != null) {
            for (com.hypersocket.permissions.PermissionType t2 : t.impliesPermissions()) {
                recurseImpliedPermissions(t2, derivedPermissions);
            }
        }
    }
}