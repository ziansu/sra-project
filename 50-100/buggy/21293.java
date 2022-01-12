private boolean isSupported(com.wix.RNCameraKit.gallery.GalleryAdapter.Image image) {
    if (supportedFileTypes.isEmpty()) {
        return true;
    }else {
        for (java.lang.String supportedMime : supportedFileTypes) {
            if (image.mimeType.toLowerCase().equals(supportedMime.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}