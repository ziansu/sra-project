public static bammerbom.ultimatecore.bukkit.api.UPlayer getPlayer(org.bukkit.OfflinePlayer p) {
    for (bammerbom.ultimatecore.bukkit.api.UPlayer pl : bammerbom.ultimatecore.bukkit.api.UC.uplayers) {
        if ((pl.uuid) == null) {
            continue;
        }
        if (pl.uuid.equals(p.getUniqueId())) {
            return pl;
        }
    }
    bammerbom.ultimatecore.bukkit.api.UPlayer pl = new bammerbom.ultimatecore.bukkit.api.UPlayer(p);
    if (pl.getPlayer().isOnline()) {
        bammerbom.ultimatecore.bukkit.api.UC.uplayers.add(pl);
    }
    return pl;
}