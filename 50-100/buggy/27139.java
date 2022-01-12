private void changeImage(javafx.scene.image.Image newImage) {
    if (!(shuffledPieces.isEmpty())) {
        shuffledPieces.clear();
    }
    piecesInNormalOrder = luxmeter.puzzlefx.model.Piece.createPieces(newImage, AppConstants.NUM_HORIZONTAL_SLICES, AppConstants.NUM_VERTICAL_SLICES);
    shuffledPieces = luxmeter.puzzlefx.model.Piece.shufflePieces(piecesInNormalOrder);
    drawShuffledPieces();
    canvas.removeEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, swapHandler);
    swapHandler = new luxmeter.puzzlefx.ui.SwapHandler(this);
    canvas.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, swapHandler);
}