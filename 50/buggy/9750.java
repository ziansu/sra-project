public void exportRendering() {
    mRenderWindow.exportRendering(java.lang.String.valueOf(raytracer.Raytracer.stopTime(tStart)), mMaxRecursions, (((int) (mAntiAliasingSamples)) * 2), mDebug, mGiLevel, mGiSamples);
}