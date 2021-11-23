private void initConfirmButton() {
    if (mIsMultiSelectMode) {
        mAdapter.doDefaultMatch(mDefaultSelectedList, mIsDisableDefaultData);
        if (((mDefaultSelectedList) == null) || (mDefaultSelectedList.isEmpty())) {
            setRightButton("确定", mConfirmListener);
            com.pm360.sortlistview.SortListActivity.setRightButtonClickable(false);
        }else {
            setRightButton((("确定(" + (mDefaultSelectedList.size())) + ")"), mConfirmListener);
            com.pm360.sortlistview.SortListActivity.setRightButtonClickable(true);
        }
    }
}