public void setMinValue(int minValue) {
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