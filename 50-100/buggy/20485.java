private void clearDisplayFileToGalleryItemMap() {
    for (java.util.Map.Entry<java.io.File, org.eclipse.nebula.widgets.gallery.GalleryItem> entry : displayFileToGalleryItemMap.entrySet()) {
        org.eclipse.swt.graphics.Image image = entry.getValue().getImage();
        if ((image != null) && (!(image.isDisposed()))) {
            image.dispose();
        }
    }
    displayFileToGalleryItemMap.clear();
}