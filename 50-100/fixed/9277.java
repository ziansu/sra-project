private int computeBestTextureResolution(int resolution) {
    int largestImageDimension = ((int) (java.lang.Math.max(model.xdim(), model.ydim())));
    int bestImageResolution = java.lang.Math.min(largestImageDimension, resolution);
    return gov.nasa.jpl.hi.marsimages.models.M.floorPowerOfTwo(bestImageResolution);
}