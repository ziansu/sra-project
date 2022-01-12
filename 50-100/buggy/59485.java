public void disableSubMap() {
    mMaps.get(io.typebrook.fiveminsmore.MapsManager.MAP_CODE_SUB).setMapType(GoogleMap.MAP_TYPE_NONE);
    setCurrentMap(io.typebrook.fiveminsmore.MapsManager.MAP_CODE_MAIN);
    mMaps.remove(io.typebrook.fiveminsmore.MapsManager.MAP_CODE_SUB);
    mMapTiles.remove(io.typebrook.fiveminsmore.MapsManager.MAP_CODE_SUB);
    mMapAddTiles.remove(io.typebrook.fiveminsmore.MapsManager.MAP_CODE_SUB);
    mClusterManagers.remove(io.typebrook.fiveminsmore.MapsManager.MAP_CODE_SUB);
    boundaryMainPolygon.remove();
    boundaryMainPolygon = null;
}