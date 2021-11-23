public static bammerbom.ultimatecore.spongeapi.api.UPlayer getPlayer(org.spongepowered.api.entity.player.User p) {
    for (bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer pl : bammerbom.ultimatecore.spongeapi.api.UC.uplayers) {
        if (pl.uuid.equals(p.getUniqueId())) {
            return pl;
        }
    }
    bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer pl = new bammerbom.ultimatecore.spongeapi.api.bammerbom.ultimatecore.spongeapi.api.UPlayer(p);
    if (pl.getPlayer().isOnline()) {
        bammerbom.ultimatecore.spongeapi.api.UC.uplayers.add(pl);
    }
    return pl;
}