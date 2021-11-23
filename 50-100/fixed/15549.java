public battleship.interfaces.Position getPosFromShotArrList(java.util.ArrayList<battleship.interfaces.Position> previousShots, java.util.ArrayList<java.lang.Integer> fleet) {
    int[] sea = this.generateSeaFromPositions(previousShots);
    int[] heatmap = this.simpleHeatMap(sea, fleet);
    battleship.interfaces.Position pos = this.getPositionFromHeatMap(heatmap);
    return pos;
}