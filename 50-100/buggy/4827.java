private void updateTileSourceSummary() {
    fillTileSourcesToPreference(tileSourcePreference, osmandSettings.MAP_TILE_SOURCES.get(), false);
    fillTileSourcesToPreference(overlayPreference, osmandSettings.MAP_OVERLAY.get(), true);
    fillTileSourcesToPreference(underlayPreference, osmandSettings.MAP_UNDERLAY.get(), true);
    tileSourcePreference.setSummary(((((R.string.map_tile_source_descr) + " [") + (osmandSettings.MAP_TILE_SOURCES.get())) + "]"));
}