public battleship.interfaces.Position getPositionFromHeatMap(int[] heatmap, java.util.ArrayList<java.lang.Integer> fleet) {
    int maxHeatIndex = 0;
    for (int i = 0; i < (heatmap.length); i++) {
        if ((heatmap[i]) > (heatmap[maxHeatIndex])) {
            maxHeatIndex = i;
        }
    }
    battleship.interfaces.Position pos = this.getPosFromIndex(maxHeatIndex);
    return pos;
}