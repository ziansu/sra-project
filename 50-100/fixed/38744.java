public int[] getSuitTilesNoRedFives(structures.Hand.Suit suit) {
    if (suit == (structures.Hand.Suit.JIHAI))
        throw new java.lang.IllegalArgumentException("Can't do this for honor tiles.");
    
    int[] suitTiles = new int[structures.Hand.SUIT_LENGTH_WITHOUT_RED_FIVES];
    java.lang.System.arraycopy(tiles, ((suit.ordinal()) * (structures.Hand.SUIT_LENGTH)), suitTiles, 0, structures.Hand.SUIT_LENGTH_WITHOUT_RED_FIVES);
    suitTiles[4] += tiles[(((suit.ordinal()) * (structures.Hand.SUIT_LENGTH)) + 9)];
    return suitTiles;
}