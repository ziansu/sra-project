@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((artists) == null) {
        outState.putParcelableArrayList(com.bli.spotifystreamer.ArtistSearchActivity.KEY_PARCELABLE_ARTIST_LIST, artists);
        int position = artistsListView.getFirstVisiblePosition();
        outState.putInt("listViewPosition", position);
        android.view.View v = artistsListView.getChildAt(0);
        int offset = (v == null) ? 0 : (v.getTop()) - (artistsListView.getPaddingTop());
        outState.putInt("listViewPositionOffset", offset);
    }
    super.onSaveInstanceState(outState);
}