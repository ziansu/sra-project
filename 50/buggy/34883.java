@java.lang.Override
public int onTileAdded() {
    android.util.Log.d("QS", "Tile added");
    return android.service.quicksettings.TileService.TILE_MODE_ACTIVE;
}