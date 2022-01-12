private boolean checkAdminPerms(org.bukkit.entity.Player player2, java.lang.String[] split) {
    if (player2.isOp()) {
        return true;
    }
    java.lang.String check = split[0];
    if (check.equalsIgnoreCase("confirm"))
        check = "purge";
    
    if (com.wasteofplastic.askygrid.util.VaultHelper.checkPerm(player2, (((com.wasteofplastic.askygrid.Settings.PERMPREFIX) + "admin.") + (check.toLowerCase())))) {
        return true;
    }
    return false;
}