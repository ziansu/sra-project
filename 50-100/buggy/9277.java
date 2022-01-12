private int computeBestTextureResolution(int resolution) {
    int largestImageDimension = ((int) (java.lang.Math.max(model.xdim(), model.ydim())));
    int bestImageResolution = java.lang.Math.min(largestImageDimension, resolution);
    android.util.Log.d(gov.nasa.jpl.hi.marsimages.models.ImageQuad.TAG, ("Texture res: " + (gov.nasa.jpl.hi.marsimages.models.M.floorPowerOfTwo(bestImageResolution))));
    return gov.nasa.jpl.hi.marsimages.models.M.floorPowerOfTwo(bestImageResolution);
}