public static int calculateLinearArrayPosition(int x, int y, int worldWidth) {
    int returnValue = (y * worldWidth) + x;
    return returnValue;
}