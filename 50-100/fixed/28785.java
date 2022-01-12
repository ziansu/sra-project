private net.coobird.thumbnailator.util.exif.Orientation getOrientation(java.lang.String imagePath) {
    net.coobird.thumbnailator.util.exif.Orientation orientation = net.coobird.thumbnailator.util.exif.Orientation.TOP_LEFT;
    try {
        com.drew.metadata.Metadata metadata = com.drew.imaging.ImageMetadataReader.readMetadata(new java.io.File(imagePath));
        com.drew.metadata.Directory directory = metadata.getFirstDirectoryOfType(com.drew.metadata.exif.ExifIFD0Directory.class);
        orientation = net.coobird.thumbnailator.util.exif.Orientation.typeOf(directory.getInt(ExifDirectoryBase.TAG_ORIENTATION));
    } catch (com.drew.imaging.ImageProcessingException | java.io.IOException | com.drew.metadata.MetadataException | java.lang.NullPointerException e) {
        orientation = net.coobird.thumbnailator.util.exif.Orientation.TOP_LEFT;
    }
    return orientation;
}