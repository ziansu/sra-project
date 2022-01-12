public void setRadiusInPixel(final int radiusInPixel) {
    if ((((mRadiusInPixel) == radiusInPixel) || (1 > radiusInPixel)) || ((mMaxRadiusInPixel) < radiusInPixel)) {
        return ;
    }
    mRadiusInPixel = radiusInPixel;
    mRadius = jp.co.cyberagent.android.gpuimage.GPUImageGaussianBlurFilter.getRadius(mRadiusInPixel);
    prepareArrays(mRadius, mRadiusInPixel);
    runOnDraw(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            setUniforms(0);
            setUniforms(1);
        }
    });
}