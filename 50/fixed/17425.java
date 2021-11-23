public void setIsVisible(boolean isVisible, nz.ac.aut.ense701.gameModel.Position position) {
    nz.ac.aut.ense701.gameModel.GridSquare result = islandGrid[position.getRow()][position.getColumn()];
    result.setIsVisible(isVisible);
}