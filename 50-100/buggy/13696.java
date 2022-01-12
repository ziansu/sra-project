public boolean has(org.bukkit.command.CommandSender me, java.lang.String perm) {
    if (!(me instanceof org.bukkit.entity.Player)) {
        return me.hasPermission(perm);
    }
    if ((pex) != null) {
        return ((org.bukkit.entity.Player) (me)).hasPermission(perm);
    }
    if ((perm2or3) != null) {
        return perm2or3.has(((org.bukkit.entity.Player) (me)), perm);
    }
    return me.hasPermission(perm);
}