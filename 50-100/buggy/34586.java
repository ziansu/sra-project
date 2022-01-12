private void setupScale() {
    double width = ((double) (maxSquareSize));
    this.padding = ((int) (java.lang.Math.round((((double) (maxSquareSize)) * 0.05))));
    this.stonePixelWidth = ((int) (width - ((padding) * 2))) / (boardSize);
}