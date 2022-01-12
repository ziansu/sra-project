public void handleDBDarkTileSwapping(java.lang.Long darkTileOPos, java.lang.Long darkTileNPos) {
    android.util.Log.d("PuzzleAdapter", "I`m in the swap handler right now");
    darkTile.setOldPosition(darkTileOPos.intValue());
    if ((darkTile.getNewPosition()) != (darkTileNPos.intValue())) {
        android.util.Log.d("PuzzleAdapter", "New position changed, need to do the swap now");
        darkTile.setNewPosition(darkTileNPos.intValue());
        setTilesFromDatabase();
    }
}