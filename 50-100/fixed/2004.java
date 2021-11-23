private void initConfirmButton() {
    if (mIsMultiSelectMode) {
        mAdapter.doDefaultMatch(mDefaultSelectedList, mIsDisableDefaultData);
        if (((mDefaultSelectedList) == null) || (mDefaultSelectedList.isEmpty())) {
            setRightButton("确定", mConfirmListener);
        }else {
            setRightButton((("确定(" + (mDefaultSelectedList.size())) + ")"), mConfirmListener);
        }
    }
}