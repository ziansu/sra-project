public static bammerbom.ultimatecore.spongeapi.api.UPlayer getPlayer(java.util.UUID u) {
    for (bammerbom.ultimatecore.spongeapi.api.UPlayer p : bammerbom.ultimatecore.spongeapi.api.UC.uplayers) {
        if (p.uuid.equals(u)) {
            return p;
        }
    }
    bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer pl = new bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer(u);
    if (pl.getPlayer().isOnline()) {
        bammerbom.ultimatecore.spongeapi.api.UC.uplayers.add(pl);
    }
    return pl;
}