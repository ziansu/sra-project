public void draw() {
    background(bgColor[0], bgColor[1], bgColor[2]);
    rule.run();
    colorizer.setRowsCols(numRows, numCols);
    colorizer.refresh();
}