@java.lang.Override
public void dataChanged(org.openstreetmap.josm.data.osm.event.DataChangedEvent event) {
    org.openstreetmap.josm.data.osm.OsmPrimitive primitive = event.getDataset().getPrimitiveById(history.getId(), history.getType());
    org.openstreetmap.josm.data.osm.history.HistoryOsmPrimitive latest;
    if (canShowAsLatest(primitive)) {
        latest = new org.openstreetmap.josm.gui.history.HistoryBrowserModel.HistoryPrimitiveBuilder().build(primitive);
    }else {
        latest = null;
    }
    setLatest(latest);
    fireModelChange();
}