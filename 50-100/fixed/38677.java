private void updateCells() {
    while ((toAdd.peek()) != null) {
        model.Cell cell = toAdd.remove();
        removeSpatial(cell.getPosition());
        addSpatial(cell);
    } 
    while ((toRemove.peek()) != null) {
        model.Position position = toRemove.remove();
        removeSpatial(position);
    } 
}