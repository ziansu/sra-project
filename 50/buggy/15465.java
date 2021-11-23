public void setCheckedItemNavigation(int position, boolean checked) {
    this.mCategoryAdapter.resetCheck();
    this.mCategoryAdapter.setChecked(position, checked);
}