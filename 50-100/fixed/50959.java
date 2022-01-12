public void copyCurrentPhotoPath() {
    if (((((data) != null) && (!(data.isEmpty()))) && ((currentPhoto) >= 0)) && ((currentPhoto) < (data.size()))) {
        org.openstreetmap.josm.tools.Utils.copyToClipboard(data.get(currentPhoto).getFile().toString());
    }
}