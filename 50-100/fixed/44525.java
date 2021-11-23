public void updateGrid() {
    gameWidthScale = (this.getSize().width) / ((this.game.getDimension().width) + 1.0);
    gameHeightScale = (this.getSize().height) / ((this.game.getDimension().height) + 1.0);
    this.repaint();
}