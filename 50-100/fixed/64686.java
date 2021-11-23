@java.lang.Override
public double getTProb(int x, int y, int h, int nX, int nY, int nH) {
    return robot.getSensor().getT(((h + (x * 4)) + ((y * 4) * (width))), ((nH + (nX * 4)) + ((nY * 4) * (width))));
}