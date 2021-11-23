public void redrawBoard() {
    for (int col = 0; col < 12; col++) {
        for (int row = 0; row < 12; row++) {
            if ((boardTiles[col][row].getExists()) == true) {
                tilePanes[col][row].setStyle("-fx-background-color: white");
            }else {
                tilePanes[col][row].setStyle("-fx-background-color: black");
            }
        }
    }
}