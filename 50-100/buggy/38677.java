private void updateCells() {
    while (!(toAdd.isEmpty())) {
        if ((toAdd.peek()) != null) {
            model.Cell cell = toAdd.remove();
            removeSpatial(cell.getPosition());
            addSpatial(cell);
        }
    } 
    while (!(toRemove.isEmpty())) {
        if ((toRemove.peek()) != null) {
            model.Position position = toRemove.remove();
            removeSpatial(position);
        }
    } 
}