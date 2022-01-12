private void clearGalleryItemToDisplayFileMap() {
    for (java.util.Map.Entry<org.eclipse.nebula.widgets.gallery.GalleryItem, java.io.File> entry : galleryItemToDisplayFileMap.entrySet()) {
        org.eclipse.swt.graphics.Image image = (entry.getKey().isDisposed()) ? null : entry.getKey().getImage();
        if ((image != null) && (!(image.isDisposed()))) {
            image.dispose();
        }
    }
    galleryItemToDisplayFileMap.clear();
}