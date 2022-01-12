public boolean tileIsEmpty(java.lang.String layer, int col, int row) {
    com.badlogic.gdx.maps.tiled.TiledMapTileLayer tiledLayer = ((com.badlogic.gdx.maps.tiled.TiledMapTileLayer) (tiledMap.getLayers().get(layer)));
    com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell currentCell = tiledLayer.getCell(col, row);
    return (currentCell == null) || ((currentCell.getTile()) == null);
}