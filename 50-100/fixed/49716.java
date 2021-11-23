private void addNewTile() {
    javafx.collections.ObservableList<EmptyTile> emptyTiles = getEmptyTileChildren();
    java.util.Random rand = new java.util.Random();
    EmptyTile et = emptyTiles.get(rand.nextInt(emptyTiles.size()));
    et.getChildren().add(new Tile());
}