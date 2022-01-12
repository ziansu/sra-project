public void run() {
    staticMapCreator();
    initializeNeighboursTerrainLists();
    map = new Controllers.Draw(aTerrainList);
    drawTheMap(map);
    printNetwork();
    start();
}