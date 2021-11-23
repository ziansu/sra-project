private void initSearchByPatternFields() {
    if (!(android.text.TextUtils.isEmpty(mDisplayName))) {
        mLowerCaseDisplayName = mDisplayName.toLowerCase();
    }
    if (!(android.text.TextUtils.isEmpty(mUserId))) {
        mLowerCaseMatrixId = mUserId.toLowerCase();
    }
}