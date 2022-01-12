public void setHole(int row, int col) {
    this.gameGrid[row][col].setSymbol(Symbol.O);
    for (int[] item : this.listPegs) {
        if (java.util.Arrays.equals(item, new int[]{ row , col })) {
            this.listPegs.remove(item);
            break;
        }
    }
}