public void addUsedTile(Piece piece, Tile tile) {
    if ((m_usedTiles.get(piece)) != null) {
        m_usedTiles.get(piece).add(tile);
    }else {
        java.util.ArrayList<Tile> usedTiles = new java.util.ArrayList<Tile>();
        usedTiles.add(tile);
        m_usedTiles.put(piece, usedTiles);
    }
}