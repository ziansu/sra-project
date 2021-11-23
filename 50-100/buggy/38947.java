public void saveDot(java.lang.String colourString, double x, double y) {
    (Grid.dotsFound)++;
    grid[Grid.dotsFound].setColour(colourString);
    grid[Grid.dotsFound].setXPos(x);
    grid[Grid.dotsFound].setYPos(y);
    grid[Grid.dotsFound].setDiscovered(true);
}