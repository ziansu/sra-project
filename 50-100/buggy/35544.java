private void toListView() {
    mActiveLayout = hu.mrolcsi.android.filebrowser.option.Layout.LIST;
    mItemLayoutID = R.layout.browser_listitem_layout;
    rvFileList.setLayoutManager(mLinearLayout);
    loadList(new java.io.File(mCurrentPath));
    menuSwitchLayout.setTitle(R.string.browser_menu_viewAsGrid);
    menuSwitchLayout.setIcon(hu.mrolcsi.android.filebrowser.util.Utils.tintDrawable(getContext(), R.drawable.browser_grid));
}