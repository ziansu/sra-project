@java.lang.Override
public int getTime() {
    io.resourcepool.hvsz.service.Game game = get();
    java.lang.Integer result = game.getStatus().getTimeLeft();
    if (result == null) {
        return -1;
    }
    return result;
}