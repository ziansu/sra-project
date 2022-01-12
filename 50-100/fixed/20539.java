public void resetPieces() {
    if (!(level.getBullpen().getPieces().isEmpty())) {
        level.getBullpen().getPieces().clear();
        bullpenView.getChildren().clear();
        numberOfBullpenPieces = 0;
    }
}