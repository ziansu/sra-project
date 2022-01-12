public void displayLife() {
    java.util.Collection<thelife.engine.Point> allAliveCells = space.getAllAliveCells();
    sceneCells.getChildren().clear();
    allAliveCells.stream().filter(sceneScreen::isVisible).map(sceneScreen::toScreenRect).forEach(this::drawCell);
}