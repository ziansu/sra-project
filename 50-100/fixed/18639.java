public void deselect() {
    for (int i = (shapes.size()) - 1; i >= 0; i--) {
        shapes.get(i).setShapeSelected(false);
        shapes.get(i).setRotating(false);
    }
    this.setChanged();
    this.notifyObservers();
}