public void setRadiusInPixel(final int radiusInPixel) {
    if ((((mRadiusInPixel) == radiusInPixel) || (1 > radiusInPixel)) || ((mMaxRadiusInPixel) < radiusInPixel)) {
        return ;
    }
    mRadiusInPixel = radiusInPixel;
    mRadius = jp.co.cyberagent.android.gpuimage.GPUImageGaussianBlurFilter.getRadius(mRadiusInPixel);
    prepareArrays(mRadius, mRadiusInPixel);
    setUniforms(0);
    setUniforms(1);
}