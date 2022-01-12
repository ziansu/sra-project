public com.rgi.common.coordinate.Coordinate<java.lang.Double> getBottomRight(final double rasterHeight, final double rasterWidth) {
    return new com.rgi.common.coordinate.Coordinate(((this.affineTransform[3]) + ((this.affineTransform[5]) * rasterHeight)), ((this.affineTransform[0]) + ((this.affineTransform[1]) * rasterWidth)));
}