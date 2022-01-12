private void setupScale() {
    double width = ((double) (maxSquareSize));
    int buffer = ((int) (java.lang.Math.round((((double) (maxSquareSize)) * 0.05))));
    this.stonePixelWidth = ((int) (width - (buffer * 2))) / (boardSize);
    this.padding = buffer + ((stonePixelWidth) / 2);
}