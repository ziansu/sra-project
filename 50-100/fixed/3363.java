private battleship.interfaces.Position getPositionFromHeatMap(int[] heatmap) {
    int maxHeatIndex = 0;
    for (int i = 0; i < (heatmap.length); i++) {
        if ((heatmap[i]) > (heatmap[maxHeatIndex])) {
            maxHeatIndex = i;
        }
    }
    battleship.interfaces.Position pos = this.getPosFromIndex(maxHeatIndex);
    return pos;
}