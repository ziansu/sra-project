@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    zoomLevel = getMapTree().getViewer().getZoom();
    mapViewerLat -= (((mapDragY) - (e.getY())) * 0.001) / ((zoomLevel) * 1000);
    mapViewerLon -= (((e.getX()) - (mapDragX)) * 0.001) / ((zoomLevel) * 1000);
    getMapTree().getViewer().setDisplayPosition(new org.openstreetmap.gui.jmapviewer.Coordinate(mapViewerLat, mapViewerLon), zoomLevel);
}