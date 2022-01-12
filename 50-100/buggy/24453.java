private void checkCanSetPermissions(java.lang.String resourceId, java.util.Set<java.lang.String> entities, org.apache.zeppelin.notebook.NotebookAuthorization.PermissionType permissionType) {
    if (isRootFolder(resourceId)) {
        throw new java.lang.RuntimeException("Cannot change permissions of the root folder");
    }
    if (!(canSetPermissions(resourceId, entities, permissionType))) {
        throw new java.lang.RuntimeException((("Cannot change permissions for resource " + "under folder with permissions. Id = ") + resourceId));
    }
}