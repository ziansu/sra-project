public boolean isInside(Location location) {
    if (((((location.getX()) > (worldSize)) || ((location.getX()) < 0)) || ((location.getY()) > (worldSize))) || ((location.getY()) < 0)) {
        return false;
    }else {
        return true;
    }
}