private void loadPolygons(com.mygdx.game.client.model.ClientTiledMap tiledMap) {
    for (com.badlogic.gdx.utils.XmlReader.Element tilesetXml : root.getChildrenByName("tileset")) {
        int firstGid = tilesetXml.getInt("firstgid", 1);
        for (com.badlogic.gdx.utils.XmlReader.Element tileXml : tilesetXml.getChildrenByName("tile")) {
            int localId = tileXml.getInt("id");
            int tileGid = firstGid + localId;
            com.mygdx.game.shared.model.CollideablePolygon tileHitbox = com.mygdx.game.shared.model.TilePolygonLoader.loadTilePolygon(tileXml, tileHeight);
            tiledMap.gidToPolygonMap.put(tileGid, tileHitbox);
        }
    }
}