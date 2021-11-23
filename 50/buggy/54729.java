public double invScaleY(double pixelCoordinate) {
    return ((pixelCoordinate * (this.maxVertexHeight)) / (initRootHeight)) / (factorY);
}