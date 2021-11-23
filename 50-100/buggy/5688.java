private void update() {
    block = true;
    for (final net.slipcor.pvparena.arena.ArenaPlayer player : arena.getEveryone()) {
        if ((((player.getStatus()) == (ArenaPlayer.Status.DEAD)) || ((player.getStatus()) == (ArenaPlayer.Status.LOST))) || ((player.getStatus()) == (ArenaPlayer.Status.NULL))) {
            continue;
        }
        update(player.get());
    }
    block = false;
}