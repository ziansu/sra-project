@java.lang.Override
public void movePlayer(common.utils.Direction dir) throws player.InvalidPlayerExceptions {
    player.setCurrentDir(dir);
    if (player.move(dir.getX(), dir.getY())) {
        set(getCurrentMap());
    }
}