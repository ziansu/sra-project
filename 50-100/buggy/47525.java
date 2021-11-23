public void setMinValue(int minValue) {
    if (minValue < 0) {
        throw new java.lang.IllegalArgumentException("minValue must be >= 0");
    }
    mMinValue = minValue;
    if ((mMinValue) > (mValue)) {
        mValue = mMinValue;
    }
    boolean wrapSelectorWheel = ((mMaxValue) - (mMinValue)) > (mSelectorIndices.length);
    setWrapSelectorWheel(wrapSelectorWheel);
    initializeSelectorWheelIndices();
    updateInputTextView();
    tryComputeMaxWidth();
    invalidate();
}