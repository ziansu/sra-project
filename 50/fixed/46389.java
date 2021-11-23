public void initMapData(int maximumX, int maximumY) {
    maxX = maximumX;
    maxY = maximumY;
    mapData = new byte[maxX][maxY];
    mapCloakDetection = new int[maxX][maxY];
}