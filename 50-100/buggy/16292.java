private float getSize(long now) {
    if ((mSizeMax) == 0)
        return 0;
    
    long dt = now - (mLastPokeTime);
    if (dt > ((mHold) + (mDecay)))
        return mSizeMin;
    
    if (dt < (mHold))
        return mSizeMax;
    
    return ((int) (com.android.systemui.statusbar.policy.DeadZone.lerp(mSizeMax, mSizeMin, (((float) (dt - (mHold))) / (mDecay)))));
}