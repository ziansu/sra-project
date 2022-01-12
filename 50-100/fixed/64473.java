public void removePoint(int index) throws net.sf.openrocket.rocketcomponent.IllegalFinPointException {
    if ((index == 0) || (index == ((points.size()) - 1))) {
        throw new net.sf.openrocket.rocketcomponent.IllegalFinPointException("cannot remove first or last point");
    }
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.ArrayList<net.sf.openrocket.util.Coordinate> copy = ((java.util.ArrayList<net.sf.openrocket.util.Coordinate>) (this.points.clone()));
    this.points.remove(index);
    if (!(validate())) {
        this.points = copy;
    }
    fireComponentChangeEvent(ComponentChangeEvent.BOTH_CHANGE);
}