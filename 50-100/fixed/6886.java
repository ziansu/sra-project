public boolean isPointInArea(java.awt.Point pos, int areaLeftX, int areaRightX, int areaUpY, int areaDownY) {
    return (((areaLeftX < (pos.x)) && ((pos.x) < areaRightX)) && (areaUpY < (pos.y))) && ((pos.y) < areaDownY);
}