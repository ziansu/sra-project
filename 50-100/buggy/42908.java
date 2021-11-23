public void setErrorEnabled(boolean errorEnabled) {
    mErrorEnabled = errorEnabled;
    if (!errorEnabled) {
        mErrorCached = mError;
        mError = "";
    }else {
        mError = mErrorCached;
    }
    if (mErrorEnabled) {
        mText = mEditText.getText().toString();
        setCustomStyle(mCurrentCustomStyle);
    }else {
        mErrorChanged = true;
        reloadEditAndMarqueeViews();
    }
}