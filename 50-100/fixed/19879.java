public static void clearImageCacheForMediaEntity(org.tinymediamanager.core.entities.MediaEntity entity) {
    java.util.List<org.tinymediamanager.core.entities.MediaFile> mediaFiles = new java.util.ArrayList(entity.getMediaFiles());
    for (org.tinymediamanager.core.entities.MediaFile mediaFile : mediaFiles) {
        if (mediaFile.isGraphic()) {
            java.nio.file.Path file = org.tinymediamanager.core.ImageCache.getCachedFile(mediaFile.getFileAsPath());
            if (file != null) {
                org.tinymediamanager.core.Utils.deleteFileSafely(file);
            }
        }
    }
}