private void clickFirst() {
    selectHeader(0);
    if ((mSelectedItem) == null) {
        return ;
    }
    mSelectedItem.performClick();
}