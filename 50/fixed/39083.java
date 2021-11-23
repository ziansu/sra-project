@java.lang.Override
public void removePermission(java.lang.String permission) {
    super.removePermission(permission);
    updateCalculable();
}