@java.lang.Override
public int getZombie() {
    io.resourcepool.hvsz.service.Game game = get();
    return game.getStatus().getZombiePlayers();
}