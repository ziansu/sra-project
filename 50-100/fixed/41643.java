private java.io.ByteArrayOutputStream createThumbnail(java.lang.String imagePath, net.coobird.thumbnailator.util.exif.Orientation orientation) {
    java.io.ByteArrayOutputStream stream = new java.io.ByteArrayOutputStream();
    try {
        net.coobird.thumbnailator.Thumbnails.of(imagePath).size(thumbnailWidth, thumbnailHeight).outputFormat("jpg").toOutputStream(stream);
        stream.close();
    } catch (java.io.IOException e) {
        logErrorStackTrace(e);
    }
    return stream;
}