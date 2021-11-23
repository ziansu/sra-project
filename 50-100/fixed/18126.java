void spawnCluster(java.awt.Color c, int size, int cellSize) {
    int x;
    int y;
    do {
        x = Random.randInt(0, (size - 1));
        y = Random.randInt(0, (size - 1));
    } while (clusterAlreadyExists(new java.awt.Point(x, y), cellSize) );
    cluster.add(new unoCluster(c, x, y, cellSize));
}