private void enterEdit() {
    if ((mAlbumView.getChildCount()) > 0) {
        mAlbumView.setEditable(true, this, true);
    }
    if ((mAlbumView_right.getChildCount()) > 0) {
        mAlbumView_right.setEditable(true, this, true);
    }
    left_count_tv.setVisibility(View.VISIBLE);
    right_count_tv.setVisibility(View.VISIBLE);
    commit_bt.setVisibility(View.VISIBLE);
    findViewById(R.id.header_bar_navi).setVisibility(View.GONE);
    findViewById(R.id.header_bar_select).setVisibility(View.VISIBLE);
}