public boolean removePoint(int index) {
    points.remove(index);
    updateRegionPoints();
    return true;
}