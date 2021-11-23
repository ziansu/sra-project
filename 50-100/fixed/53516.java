private com.badlogic.gdx.maps.tiled.TiledMapTileLayer chooseObstacles() {
    int count = 0;
    while ((map.getLayers().get(java.lang.String.format("Obstacles%d", count))) != null) {
        count++;
    } 
    if (count == 0) {
        return null;
    }else {
        return ((com.badlogic.gdx.maps.tiled.TiledMapTileLayer) (map.getLayers().get(java.lang.String.format("Obstacles%d", com.badlogic.gdx.math.MathUtils.random(0, (count - 1))))));
    }
}