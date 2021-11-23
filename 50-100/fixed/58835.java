public void changeTileSystem(com.asarg.polysim.TileSystem newTS) {
    java.lang.System.out.println("WARNING: CHANGING THE TILE SYSTEM, PREPARE FOR ERRORS!");
    tileSystem = newTS;
    cleanUp();
    getOpenGlues();
    frontier.changeTileSystem(newTS);
    frontier.clear();
    calculateFrontier();
    printDebugInformation();
    setChanged();
    notifyObservers(new javafx.util.Pair<java.lang.String, com.asarg.polysim.FrontierElement>("Tile System", null));
    java.lang.System.out.println(("Frontier: " + (frontier.size())));
}