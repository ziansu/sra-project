public void allowCheckStateShadow(boolean allow) {
    if (allow != (mAllowCheckStateShadow)) {
        mAllowCheckStateShadow = allow;
        setShadowInternal(mShadowRadius, mShadowColor, true);
    }
}