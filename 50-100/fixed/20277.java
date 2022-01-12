public void redrawBoard() {
    for (int col = 0; col < 12; col++) {
        for (int row = 0; row < 12; row++) {
            if ((boardTiles.get(row).get(col).getExists()) == true) {
                tilePanes.get(row).get(col).setStyle("-fx-background-color: white");
            }else {
                tilePanes.get(row).get(col).setStyle("-fx-background-color: black");
            }
        }
    }
}