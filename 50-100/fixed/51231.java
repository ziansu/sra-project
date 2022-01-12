@java.lang.Override
public com.dramzy.puzzle.Coord2d next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException("No more elements in Grid");
    }
    if ((coords) == null) {
        coords = new com.dramzy.puzzle.Coord2d(0, 0);
    }else
        if ((coords.getX()) == ((getWidth()) - 1)) {
            coords.moveY(1).setX(0);
        }else {
            coords.moveX(1);
        }
    
    return coords.clone();
}