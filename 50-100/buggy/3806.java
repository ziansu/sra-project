public static bammerbom.ultimatecore.spongeapi.api.UPlayer getPlayer(java.lang.String n) {
    for (bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer pl : bammerbom.ultimatecore.spongeapi.api.UC.uplayers) {
        if (pl.name.equals(n)) {
            return pl;
        }
    }
    bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer pl = new bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer(r.searchOfflinePlayer(n));
    bammerbom.ultimatecore.spongeapi.api.UC.uplayers.add(pl);
    return pl;
}