public int getyPoints(int xcoord) {
    if ((xcoord < 700) && (xcoord > 0)) {
        return src.Terrain.yPoints[xcoord];
    }else {
        return -1;
    }
}