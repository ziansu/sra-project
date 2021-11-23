public static void clearPermissions(org.bukkit.entity.Player player) {
    org.bukkit.permissions.PermissionAttachment permission = com.thetonyk.Hub.Managers.PermissionsManager.permissions.get(player.getUniqueId());
    if (permission == null)
        return ;
    
    player.removeAttachment(com.thetonyk.Hub.Managers.PermissionsManager.permissions.remove(player.getUniqueId()));
}