protected void toGridView() {
    mActiveLayout = hu.mrolcsi.android.filebrowser.option.Layout.GRID;
    rvFileList.setLayoutManager(mGridLayout);
    mItemLayoutID = R.layout.browser_griditem_layout;
    loadList(new java.io.File(mCurrentPath));
    menuSwitchLayout.setTitle(R.string.browser_menu_viewAsList);
    menuSwitchLayout.setIcon(hu.mrolcsi.android.filebrowser.util.Utils.tintDrawable(getContext(), R.drawable.browser_list));
}