public void setErrorEnabled(boolean errorEnabled) {
    mErrorEnabled = errorEnabled;
    if (!errorEnabled) {
        mErrorCached = mError;
        mError = "";
    }else {
        mError = mErrorCached;
    }
    mText = mEditText.getText().toString();
    setCustomStyle(mCurrentCustomStyle);
}