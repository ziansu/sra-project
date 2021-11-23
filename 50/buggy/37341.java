public void stop(final boolean force) {
    for (final net.slipcor.pvparena.arena.ArenaPlayer p : getFighters()) {
        playerLeave(p.get(), CFG.TP_EXIT, true);
    }
    reset(force);
}