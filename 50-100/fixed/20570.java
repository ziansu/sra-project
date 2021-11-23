protected void processPhotoMetadata(java.io.File file, org.mashupmedia.model.media.photo.Photo photo) throws com.drew.imaging.ImageProcessingException, com.drew.metadata.MetadataException, java.io.IOException {
    com.drew.metadata.Metadata metadata = com.drew.imaging.ImageMetadataReader.readMetadata(file);
    java.util.Date takenOn = getTakenOnDatefromMeta(file, metadata);
    if (takenOn != null) {
        photo.setTakenOn(takenOn);
    }
    int orientation = getOrientatonFromMeta(metadata);
    photo.setOrientation(orientation);
}