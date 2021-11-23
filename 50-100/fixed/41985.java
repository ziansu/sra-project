public void setHole(int row, int col) {
    this.gameGrid[row][col].setSymbol(Symbol.O);
    int index = 0;
    for (int[] item : this.listPegs) {
        if (java.util.Arrays.equals(item, new int[]{ row , col })) {
            this.listPegs.remove(index);
            break;
        }
        index++;
    }
}