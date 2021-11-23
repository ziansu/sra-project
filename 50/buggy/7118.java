private float modelCoordYToCanvas(float y, float minY, float canvasDimension, float bDimension, float[] boundingBox) {
    return minY + ((((boundingBox[3]) + y) / bDimension) * canvasDimension);
}