private void showItemListFragment() {
    if ((mItemListFragment) != null) {
        if ((mChannelListFragment.getLastSelectedChannel().getId()) != 0) {
            onItemSelected(mChannelListFragment.getLastSelectedChannel());
        }
        return ;
    }
    mItemListFragment = new com.igordotsenko.dotsenkorssreader.ItemListFragment();
    openItemListFragmentSmall();
}