private float getIdleTransientPullStrainValue(int maxFoldTime, long time) {
    int foldTime = (maxFoldTime * (mStartFoldingPullStrain)) / (com.mishiranu.dashchan.widget.PullableWrapper.PullView.MAX_STRAIN);
    if (foldTime <= 0)
        return 0.0F;
    
    float value = java.lang.Math.min((((float) (time - (mTimeStateStart))) / foldTime), 1.0F);
    return ((1.0F - value) * (mStartFoldingPullStrain)) / (com.mishiranu.dashchan.widget.PullableWrapper.PullView.MAX_STRAIN);
}