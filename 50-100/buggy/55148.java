private float getIdleTransientPullStrainValue(int maxFoldTime, long time) {
    int foldTime = (maxFoldTime * (mStartFoldingPullStrain)) / (com.mishiranu.dashchan.widget.PullableWrapper.PullView.MAX_STRAIN);
    float value = java.lang.Math.min((((float) (time - (mTimeStateStart))) / foldTime), 1.0F);
    return ((1.0F - value) * (mStartFoldingPullStrain)) / (com.mishiranu.dashchan.widget.PullableWrapper.PullView.MAX_STRAIN);
}