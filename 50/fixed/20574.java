@java.lang.Override
public void addPermission(java.lang.String permission, boolean isTrue) {
    super.addPermission(permission, isTrue);
    updateCalculable();
}