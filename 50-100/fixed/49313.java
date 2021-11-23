public java.util.List<java.lang.String> getCodes() {
    java.util.List<java.lang.String> codes = new java.util.ArrayList<>();
    for (woohoo.utils.gameobjects.Tile tile : tileList) {
        codes.add(((tile.getDecorationCode()) + (tile.getCode())));
    }
    return codes;
}