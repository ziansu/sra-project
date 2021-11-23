public void removePoint(int index) throws net.sf.openrocket.rocketcomponent.IllegalFinPointException {
    if ((index == 0) || (index == ((points.size()) - 1))) {
        throw new net.sf.openrocket.rocketcomponent.IllegalFinPointException("cannot remove first or last point");
    }
    net.sf.openrocket.util.ArrayList<net.sf.openrocket.util.Coordinate> copy = this.points.clone();
    copy.remove(index);
    validate(copy);
    this.points = copy;
    fireComponentChangeEvent(ComponentChangeEvent.BOTH_CHANGE);
}