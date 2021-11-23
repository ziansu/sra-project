@java.lang.Override
public boolean isPermissionSet(java.lang.String permission) {
    ru.tehkode.permissions.PermissionUser user = ru.tehkode.permissions.bukkit.PermissionsEx.getUser(this.player);
    if ((user != null) && ((user.getMatchingExpression(permission, this.player.getWorld().getName())) != null)) {
        return true;
    }
    return super.isPermissionSet(permission);
}