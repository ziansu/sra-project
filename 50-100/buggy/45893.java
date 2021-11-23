public void selectNext() {
    if ((getSelectedImage()) instanceof org.openstreetmap.josm.plugins.mapillary.MapillaryImage) {
        if ((getSelectedImage()) == null)
            return ;
        
        if ((((org.openstreetmap.josm.plugins.mapillary.MapillaryImage) (getSelectedImage())).getSequence()) == null)
            return ;
        
        setSelectedImage(((org.openstreetmap.josm.plugins.mapillary.MapillaryImage) (getSelectedImage())).next());
    }
}