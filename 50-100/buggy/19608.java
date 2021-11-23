public int[] getXPoints(int block, int ofset) {
    int[] _xpoints = new int[getNumberOfPoints()];
    for (int i = 0; i < (getNumberOfPoints()); i++) {
        _xpoints[i] = ((getXPoints()[i]) * block) + ofset;
    }
    return _xpoints;
}