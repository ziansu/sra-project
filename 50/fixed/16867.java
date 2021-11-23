public void draw() {
    background(bgColor[0], bgColor[1], bgColor[2]);
    colorizer.setRowsCols(numRows, numCols);
    rule.run();
    colorizer.refresh();
}