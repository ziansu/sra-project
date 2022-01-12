protected void showPopupMenu(java.awt.event.MouseEvent evt) {
    org.openstreetmap.josm.gui.history.HistoryBrowserModel.VersionTableModel model = getVersionTableModel();
    int row = rowAtPoint(evt.getPoint());
    if (!(model.isLatest(row))) {
        org.openstreetmap.josm.data.osm.history.HistoryOsmPrimitive primitive = model.getPrimitive(row);
        popupMenu.prepare(primitive);
        popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
    }
}