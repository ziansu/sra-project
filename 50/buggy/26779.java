public void loadFromFile(java.lang.String path) throws java.io.IOException {
    java.util.List<java.lang.String> mapLines = loadMapLines(path);
    obstacleContainer.loadObstacles(mapLines);
    loadMapItems(mapLines);
}