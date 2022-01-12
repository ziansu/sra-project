public com.rgi.common.coordinate.Coordinate<java.lang.Integer> transform(final com.rgi.common.tile.TileOrigin toOrigin, final int tileX, final int tileY, final com.rgi.common.tile.scheme.TileMatrixDimensions matrixDimensions) {
    if (toOrigin == null) {
        throw new java.lang.IllegalArgumentException("Requested tile origin may not be null");
    }
    if (matrixDimensions == null) {
        throw new java.lang.IllegalArgumentException("Tile matrix dimensions may not be null");
    }
    return new com.rgi.common.coordinate.Coordinate(this.transformHorizontal(toOrigin, tileX, matrixDimensions.getWidth()), this.transformVertical(toOrigin, tileY, matrixDimensions.getHeight()));
}