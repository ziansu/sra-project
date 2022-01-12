private void updateBadgeTextOnAppBar() {
    if ((menuLocationList) == null) {
        return ;
    }
    if ((mBadgeView) == null) {
        return ;
    }
    if (((mAvailablePlaygroundList) == null) || ((mAvailablePlaygroundList.size()) <= 0)) {
        mBadgeView.hide(true);
        return ;
    }
    mBadgeView.show(true);
    mBadgeView.setText(java.lang.String.valueOf(mAvailablePlaygroundList.size()));
}