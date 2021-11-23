public void copyCurrentPhotoPath() {
    org.openstreetmap.josm.gui.layer.geoimage.ImageEntry toCopy = null;
    if (((((data) != null) && (!(data.isEmpty()))) && ((currentPhoto) >= 0)) && ((currentPhoto) < (data.size()))) {
        toCopy = data.get(currentPhoto);
        java.lang.String copyString = toCopy.getFile().toString();
        org.openstreetmap.josm.tools.Utils.copyToClipboard(copyString);
    }
}