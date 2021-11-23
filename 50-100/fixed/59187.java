private void showItemListFragment() {
    if ((mItemListFragment) != null) {
        if ((mItemListFragment.getLastSelectedChannel().getId()) != 0) {
            onItemSelected(mItemListFragment.getLastSelectedChannel());
        }
        return ;
    }
    mItemListFragment = new com.igordotsenko.dotsenkorssreader.ItemListFragment();
    openItemListFragmentSmall();
}