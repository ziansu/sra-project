public static bammerbom.ultimatecore.bukkit.api.UPlayer getPlayer(java.util.UUID u) {
    for (bammerbom.ultimatecore.bukkit.api.UPlayer p : bammerbom.ultimatecore.bukkit.api.UC.uplayers) {
        if (p.uuid.equals(u)) {
            return p;
        }
    }
    bammerbom.ultimatecore.bukkit.api.UPlayer pl = new bammerbom.ultimatecore.bukkit.api.UPlayer(u);
    if (pl.getPlayer().isOnline()) {
        bammerbom.ultimatecore.bukkit.api.UC.uplayers.add(pl);
    }
    return pl;
}