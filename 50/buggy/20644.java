public void run() {
    staticMapCreator();
    initializeStaticTrafficLights();
    initializeNeighboursTerrainLists();
    map = new Controllers.Draw(aTerrainList);
    drawTheMap(map);
    printNetwork();
    start();
}