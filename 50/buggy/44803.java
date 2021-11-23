public float adjustY(float y) {
    return ((((gridHeight) - y) - 1) * (cellHeight)) + (getY());
}