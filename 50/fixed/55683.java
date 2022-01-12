@java.lang.Override
public int getZombie() {
    io.resourcepool.hvsz.service.Game game = get();
    java.lang.Integer result = game.getStatus().getZombiePlayers();
    if (result == null) {
        return -1;
    }
    return result;
}