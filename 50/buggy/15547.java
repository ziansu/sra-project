public void add(models.TileModel tile) {
    if (!(_participants.contains(tile))) {
        _participants.add(tile.getIdentifier());
    }
}