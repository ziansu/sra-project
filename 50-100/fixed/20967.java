public void handleDBDarkTileSwapping(java.lang.Long darkTileOPos, java.lang.Long darkTileNPos) {
    darkTile.setOldPosition(darkTileOPos.intValue());
    if ((darkTile.getNewPosition()) != (darkTileNPos.intValue())) {
        darkTile.setNewPosition(darkTileNPos.intValue());
        setTilesFromDatabase();
    }
}