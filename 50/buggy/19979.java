@com.google.common.eventbus.Subscribe
protected void handleTileEvent(event.TilesEvent e) {
    updateTiles(e.getExtended());
}