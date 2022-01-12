public java.lang.Object move(MovableObject object, int x, int y) {
    java.lang.Object oldOccupant = map[x][y];
    if (oldOccupant instanceof AcquirableObject) {
        if (object instanceof PacMan) {
            int value = ((AcquirableObject) (oldOccupant)).acquire();
            ((PacMan) (object)).increaseScore(value);
        }
    }
    map[x][y] = object;
    object.setX(x);
    object.setY(y);
    return oldOccupant;
}