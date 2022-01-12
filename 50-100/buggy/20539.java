public void resetPieces() {
    if ((level.getBullpen().getPieces().size()) > 0) {
        level.getBullpen().getPieces().clear();
        bullpenView.getChildren().clear();
        numberOfBullpenPieces = 0;
    }
}