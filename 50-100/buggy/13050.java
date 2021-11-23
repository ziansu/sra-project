private void loadTile(com.badlogic.gdx.utils.XmlReader.Element tile, int firstGid) {
    int id = tile.getIntAttribute("id");
    com.mygdx.game.shared.model.CollideablePolygon tilePolygon = com.mygdx.game.shared.model.TilePolygonLoader.loadTilePolygon(tile, tileHeight);
    int tileGid = firstGid + id;
    tiles.put(tileGid, new com.mygdx.game.server.model.MapLoader.Tile(tilePolygon));
}