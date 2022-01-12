public static com.mousebird.maply.Mbr geoBoundsForTile(com.mousebird.maply.MaplyTileID tileID) {
    com.mousebird.maply.Mbr mbr = new com.mousebird.maply.Mbr(new com.mousebird.maply.Point2d(0, 0), new com.mousebird.maply.Point2d(0, 0));
    com.mousebird.maply.QuadPagingLayer.geoBoundsForTileNative(tileID.x, tileID.y, tileID.level, mbr.ll, mbr.ur);
    return mbr;
}