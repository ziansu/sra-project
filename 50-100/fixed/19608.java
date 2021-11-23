public int[] getXPoints(int block, int offset) {
    int[] _xpoints = new int[getNumberOfPoints()];
    for (int i = 0; i < (getNumberOfPoints()); i++) {
        _xpoints[i] = ((getXPoints()[i]) * block) + offset;
    }
    return _xpoints;
}