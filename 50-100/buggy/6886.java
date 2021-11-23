public boolean isPointInArea(java.awt.Point pos, int areaLeftX, int areaRightX, int areaUpY, int areaDownY) {
    boolean in = false;
    in = areaLeftX < (pos.x);
    in = (pos.x) < areaRightX;
    in = areaUpY < (pos.y);
    in = (pos.y) < areaDownY;
    return in;
}