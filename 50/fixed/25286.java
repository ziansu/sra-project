@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    com.alexshtf.offlinenavigator.MapsDb.removeAnchor(mapsDbOpenHelper, mapId, com.alexshtf.offlinenavigator.AnchorsManager.pointOnImageOf(anchorView));
    anchorsManager.removeAnchor(anchorView);
    return true;
}