private float getIdleTransientPullStrainValue(long time) {
    int foldTime = ((com.mishiranu.dashchan.widget.PullableWrapper.JellyBeanView.IDLE_FOLD_TIME) * (mStartIdlePullStrain)) / (com.mishiranu.dashchan.widget.PullableWrapper.PullView.MAX_STRAIN);
    float value = java.lang.Math.min((((float) (time - (mTimeIdleStart))) / foldTime), 1.0F);
    return ((1.0F - value) * (mStartIdlePullStrain)) / (com.mishiranu.dashchan.widget.PullableWrapper.PullView.MAX_STRAIN);
}