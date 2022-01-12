public static java.lang.String getZoomName(final org.mrgeo.hdfs.image.HdfsMrsImageDataProvider dp, final int zoomLevel) {
    try {
        org.mrgeo.image.MrsPyramid pyramid = org.mrgeo.image.MrsPyramid.open(dp);
        org.mrgeo.image.MrsPyramidMetadata metadata = pyramid.getMetadata();
        java.lang.String zoomName = metadata.getName(zoomLevel);
        if (zoomName != null) {
            return new org.mrgeo.hdfs.input.image.Path(dp.getResourcePath(true), zoomName).toUri().toString();
        }
    } catch (java.io.IOException e) {
        org.mrgeo.hdfs.input.image.HdfsMrsPyramidInputFormat.log.error("Error getting zoom name", e);
    }
    return null;
}