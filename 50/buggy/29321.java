public void performCalc(model.TileModel[] neighbors, model.TileModel tile) {
    int result = 0;
    for (model.TileModel tile : neighbors) {
        result = result + (tile.getInt());
    }
    setChanged();
    notifyObservers();
}