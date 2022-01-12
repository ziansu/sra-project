private void validateCurrentView(java.lang.CharSequence str) {
    int val = getSelectedPos(str.toString());
    if ((val >= (mStart)) && (val <= (mEnd))) {
        mPrevious = mCurrent;
        mCurrent = val;
        notifyChange();
    }
    updateView();
}