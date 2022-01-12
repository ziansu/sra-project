private void moveAllBack() {
    for (com.pansmileSoftware.pixelPuzzle.model.Square square : com.pansmileSoftware.pixelPuzzle.model.ResourceManager.getSquares()) {
        square.moveToNumber(square.getInitialNumber(), com.pansmileSoftware.pixelPuzzle.model.ResourceManager.getSideSizeProperty().get());
    }
}