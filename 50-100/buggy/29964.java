private void initSearchByPatternFields() {
    if (!(android.text.TextUtils.isEmpty(mDisplayName))) {
        mLowerCaseDisplayName = mDisplayName.toLowerCase();
    }
    if (!(android.text.TextUtils.isEmpty(mUserId))) {
        int sepPos = mUserId.indexOf(":");
        if (sepPos > 0) {
            mLowerCaseMatrixId = mUserId.substring(0, sepPos).toLowerCase();
        }
    }
}