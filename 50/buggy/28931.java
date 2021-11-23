public void click(com.ardor3d.math.type.ReadOnlyVector3 loc) {
    if ((currentIndex) < 0) {
        addWaypoint(loc, (-1));
    }else {
        addWaypoint(loc, ((currentIndex) + 1));
        (currentIndex)++;
    }
}