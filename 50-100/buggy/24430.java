public static void latLngToTileBoundedXy(com.vividsolutions.jts.geom.Coordinate coordinate, int z, int x, int y) {
    com.willkamp.myapplication.tiles.TileSystem.Pixel pixel = com.willkamp.myapplication.tiles.TileSystem.latLngToPixel(coordinate, z);
    coordinate.x = (pixel.x) - (x * (com.willkamp.myapplication.tiles.TileSystem.TILE_SIZE));
    coordinate.y = ((pixel.y) - (y * (com.willkamp.myapplication.tiles.TileSystem.TILE_SIZE))) - y;
}