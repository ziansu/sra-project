public void increaseCounterInMenu(int category, int delta) {
    java.lang.Integer pos = mCategory2Navigation.get(category);
    int firstVisiblePosition = mMenuList.getFirstVisiblePosition();
    android.view.View view = mMenuList.getChildAt((pos - firstVisiblePosition));
    mAdapter.increaseCounterInMenu(view, pos, delta);
}