public static boolean areInSameTown(org.bukkit.entity.Player p1, org.bukkit.entity.Player p2) {
    if ((me.kiro.InfernalRealms.Util.TownyUtil.isPlayerInTown(p1)) && (me.kiro.InfernalRealms.Util.TownyUtil.isPlayerInTown(p2))) {
        try {
            return me.kiro.InfernalRealms.Util.TownyUtil.getTowny().getResident(p1.getName()).getTown().equals(me.kiro.InfernalRealms.Util.TownyUtil.getTowny().getResident(p2.getName()).getTown());
        } catch (java.lang.Exception e) {
            return false;
        }
    }
    return false;
}