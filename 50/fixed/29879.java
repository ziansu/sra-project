public void selectPointFromInput(int index) {
    grid.get(index).setStatus("SELECTED");
    repaint();
}