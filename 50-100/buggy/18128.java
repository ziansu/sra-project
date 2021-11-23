private java.util.Set<org.aperteworkflow.editor.ui.permission.PermissionDefinition> getUniqueProvidedPermissionDefinitions() {
    java.util.Set<org.aperteworkflow.editor.ui.permission.PermissionDefinition> set = new java.util.TreeSet<org.aperteworkflow.editor.ui.permission.PermissionDefinition>();
    if ((provider.getPermissions()) != null) {
        for (org.aperteworkflow.editor.domain.Permission permission : provider.getPermissions()) {
            set.add(new org.aperteworkflow.editor.ui.permission.PermissionDefinition(permission));
        }
    }
    if ((provider.getPermissionDefinitions()) != null) {
        set.addAll(provider.getPermissionDefinitions());
    }
    return set;
}