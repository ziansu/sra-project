public void setRatio(float ratio) {
    mRatio = ratio;
    if ((mRatio) < 1.0F)
        mRatio = 1.0F;
    
    android.util.Log.i(com.fourtech.variometer.AltimeterView.TAG, ("setRatio() ratio=" + ratio));
}