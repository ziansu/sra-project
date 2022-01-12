private double getElevation(model.battlefield.map.Tile t, model.battlefield.map.cliff.Cliff c) {
    if ((t.getModifiedLevel()) > ((c.level) + 1)) {
        return ((c.level) + 1) * (model.battlefield.map.Tile.STAGE_HEIGHT);
    }
    return t.getElevation();
}