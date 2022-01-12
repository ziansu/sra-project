@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((org.openstreetmap.josm.plugins.mapillary.MapillaryToggleDialog.getInstance().getImage()) != null) {
        org.openstreetmap.josm.plugins.mapillary.MapillaryData.getInstance().selectNext();
        if ((org.openstreetmap.josm.plugins.mapillary.MapillaryData.getInstance().getSelectedImage()) != null)
            Main.map.mapView.zoomTo(org.openstreetmap.josm.plugins.mapillary.MapillaryData.getInstance().getSelectedImage().getLatLon());
        
    }
}