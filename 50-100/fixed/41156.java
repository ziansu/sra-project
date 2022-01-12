public java.lang.Object move(MovableObject object, int x, int y) {
    java.lang.Object oldOccupant = map[x][y];
    if (oldOccupant instanceof AcquirableObject) {
        if (object instanceof PacMan) {
            ((AcquirableObject) (oldOccupant)).acquire();
        }
    }
    map[x][y] = object;
    object.setX(x);
    object.setY(y);
    return oldOccupant;
}