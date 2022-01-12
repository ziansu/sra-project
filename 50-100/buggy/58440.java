java.util.Date getDateFromExif(java.nio.file.Path photo) throws com.drew.imaging.ImageProcessingException, java.io.IOException {
    com.drew.metadata.Metadata metadata = com.drew.imaging.ImageMetadataReader.readMetadata(photo.toFile());
    com.drew.metadata.exif.ExifSubIFDDirectory directory = metadata.getFirstDirectoryOfType(com.drew.metadata.exif.ExifSubIFDDirectory.class);
    java.util.Date date = directory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL, this.timeZone);
    java.text.SimpleDateFormat sdfEurope = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    sdfEurope.setTimeZone(this.timeZone);
    java.lang.String sDateinEurope = sdfEurope.format(date);
    return date;
}