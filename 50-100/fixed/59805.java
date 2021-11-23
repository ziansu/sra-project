public java.util.HashMap getEmptyTile() {
    java.util.HashMap emptyTile = new java.util.HashMap<java.lang.String, java.lang.Object>();
    java.util.HashMap rect = new java.util.HashMap<java.lang.String, java.lang.Object>();
    rect.put("w", 1L);
    rect.put("h", 1L);
    emptyTile.put("rect", rect);
    emptyTile.put("type", (-1L));
    return emptyTile;
}