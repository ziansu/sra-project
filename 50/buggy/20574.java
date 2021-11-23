@java.lang.Override
public void addPermission(java.lang.String permission, boolean isTrue) {
    if (getPermissionsAsString().contains(permission)) {
        return ;
    }
    super.addPermission(permission, isTrue);
    updateCalculable();
}