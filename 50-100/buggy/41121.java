public static bammerbom.ultimatecore.bukkit.api.UPlayer getPlayer(java.lang.String n) {
    for (bammerbom.ultimatecore.bukkit.api.UPlayer pl : bammerbom.ultimatecore.bukkit.api.UC.uplayers) {
        if (pl.name.equals(n)) {
            return pl;
        }
    }
    bammerbom.ultimatecore.bukkit.api.UPlayer pl = new bammerbom.ultimatecore.bukkit.api.UPlayer(r.searchOfflinePlayer(n));
    bammerbom.ultimatecore.bukkit.api.UC.uplayers.add(pl);
    return pl;
}