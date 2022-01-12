private boolean checkModPerms(org.bukkit.entity.Player player2, java.lang.String[] split) {
    if (player2.isOp()) {
        return true;
    }
    java.lang.String check = split[0];
    if (check.contains("challenge".toLowerCase())) {
        check = "challenges";
    }
    if (com.wasteofplastic.askygrid.util.VaultHelper.checkPerm(player2, (((com.wasteofplastic.askygrid.Settings.PERMPREFIX) + "mod.") + (split[0].toLowerCase())))) {
        return true;
    }
    return false;
}