public void performCalc(model.TileModel[] neighbors, model.TileModel tile) {
    int result = 0;
    for (model.TileModel t : neighbors) {
        result = result + (t.getInt());
    }
    setChanged();
    notifyObservers();
}