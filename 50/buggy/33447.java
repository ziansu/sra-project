@java.lang.Override
protected void tearDown() throws java.lang.Exception {
    org.eclipse.sirius.ecore.extender.business.internal.permission.PermissionService.removeExtension(permissionProviderDescriptor);
    permissionProviderDescriptor = null;
    editor = null;
    localSession = null;
    sessionAirdResource = null;
    super.tearDown();
}