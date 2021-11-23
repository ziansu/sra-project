public void initMapData(int maximumX, int maximumY) {
    this.maxX = maximumX;
    this.maxY = maximumY;
    mapData = new byte[maxX][maxY];
    mapCloakDetection = new int[maxX][maxY];
}