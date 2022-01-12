private int axisLength(final io.scif.ImageMetadata imageMeta, final net.imagej.axis.AxisType axisType) throws io.scif.FormatException {
    final long axisLength = imageMeta.getAxisLength(Axes.X);
    if (axisLength > (java.lang.Integer.MAX_VALUE)) {
        throw new io.scif.FormatException(((("Length of " + axisType) + " axis is too large for OMERO: ") + axisLength));
    }
    return ((int) (axisLength));
}