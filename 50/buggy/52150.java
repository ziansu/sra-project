private void toggleLaridaar() {
    laridaarMode = !(laridaarMode);
    laridaarSetup();
    ((android.widget.SimpleAdapter) (((android.widget.HeaderViewListAdapter) (shabadView.getAdapter())).getWrappedAdapter())).notifyDataSetChanged();
}