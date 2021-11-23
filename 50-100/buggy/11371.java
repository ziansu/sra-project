public void selectPrevious() {
    if ((getSelectedImage()) instanceof org.openstreetmap.josm.plugins.mapillary.MapillaryImage) {
        if ((getSelectedImage()) == null)
            return ;
        
        if ((((org.openstreetmap.josm.plugins.mapillary.MapillaryImage) (getSelectedImage())).getSequence()) == null)
            throw new java.lang.IllegalStateException();
        
        setSelectedImage(((org.openstreetmap.josm.plugins.mapillary.MapillaryImage) (getSelectedImage())).previous());
    }
}