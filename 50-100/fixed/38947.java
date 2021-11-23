public void saveDot(java.lang.String colourString, double x, double y) {
    (Grid.dotsFound)++;
    grid[((Grid.dotsFound) - 1)].setColour(colourString);
    grid[((Grid.dotsFound) - 1)].setXPos(x);
    grid[((Grid.dotsFound) - 1)].setYPos(y);
    grid[((Grid.dotsFound) - 1)].setDiscovered(true);
}