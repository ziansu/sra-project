@java.lang.Override
protected void onPostExecute(com.google.api.services.youtube.model.PlaylistListResponse playlistListResponse) {
    if (playlistListResponse == null)
        return ;
    
    mPlaylistTitles = new java.util.ArrayList();
    for (com.akoscz.youtube.Playlist playlist : playlistListResponse.getItems()) {
        mPlaylistTitles.add(playlist.getSnippet().getTitle());
    }
    android.widget.ArrayAdapter<java.util.List<java.lang.String>> spinnerAdapter = new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, mPlaylistTitles);
    spinnerAdapter.setDropDownViewResource(com.akoscz.youtube.YouTubeRecyclerViewFragment.SPINNER_ITEM_DROPDOWN_LAYOUT_ID);
    mPlaylistSpinner.setAdapter(spinnerAdapter);
}