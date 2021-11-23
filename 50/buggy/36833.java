@java.lang.Override
public void movePlayer(common.utils.Direction dir) throws player.InvalidPlayerExceptions {
    if (player.move(dir.getX(), dir.getY())) {
        set(getCurrentMap());
    }
    player.setCurrentDir(dir);
}