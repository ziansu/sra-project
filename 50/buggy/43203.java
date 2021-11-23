public void generateGrass() {
    java.util.Set<rpggame.IntegerPair> allTiles = this.getAllCoordsInZone();
    allTiles.removeAll(this.nonBuildable);
    for (rpggame.IntegerPair tile : allTiles) {
        addNonSolidGrass(tile, "grass");
    }
}