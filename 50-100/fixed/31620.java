private void generateMap(int maxFloorSize, int lowestFloorSize) {
    int x = ((int) (((java.lang.Math.random()) * (maxFloorSize - lowestFloorSize)) + lowestFloorSize));
    int y = ((int) (((java.lang.Math.random()) * (maxFloorSize - lowestFloorSize)) + lowestFloorSize));
    floor = new com.mangodev.dungeongame.Room[y][x];
    populateMap(x, y);
}