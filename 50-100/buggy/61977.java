public int getNumUnownedTiles() {
    int numUnownedTiles = 0;
    for (io.github.teamfractal.entity.LandPlot[] plotColumns : plots) {
        for (io.github.teamfractal.entity.LandPlot plot : plotColumns) {
            if (!(plot.hasOwner())) {
                numUnownedTiles++;
            }
        }
    }
    return numUnownedTiles;
}