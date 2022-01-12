private void leaveEdit() {
    if ((mAlbumView.getChildCount()) > 0) {
        mAlbumView.setEditable(false);
    }
    if ((mAlbumView_right.getChildCount()) > 0) {
        mAlbumView_right.setEditable(false);
    }
    commit_bt.setVisibility(View.GONE);
    findViewById(R.id.header_bar_navi).setVisibility(View.VISIBLE);
    findViewById(R.id.header_bar_select).setVisibility(View.GONE);
}