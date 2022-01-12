public void addTile(final com.myscrabble.entities.LetterTile lt, final int index) {
    char ch = lt.getLetter();
    int points = lt.getPoints();
    com.myscrabble.entities.LetterTile newTile = new com.myscrabble.entities.LetterTile(gsm, playerRef, ch, points, com.myscrabble.entities.TileRack.getTilePos(index), lt.getDrawAnimating(), index);
    newTile.setRecentlyAdded(true);
    tilesToAdd.put(newTile, index);
}