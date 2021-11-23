public boolean isEmpty(int x, int y, int layer) {
    return (com.kambius.darkrange.mapeditor.LevelMap.NONE_TILE) == (getTileID(x, y, layer));
}