@java.lang.Override
public synchronized void selectionChanged(final java.util.Collection<? extends org.openstreetmap.josm.data.osm.OsmPrimitive> sel) {
    org.openstreetmap.josm.plugins.mapillary.gui.imageinfo.ImageInfoPanel.L.debug(java.lang.String.format("Selection changed. %d primitives are selected.", (sel == null ? 0 : sel.size())));
    addMapillaryTagAction.setTarget(((sel != null) && ((sel.size()) == 1) ? sel.iterator().next() : null));
}