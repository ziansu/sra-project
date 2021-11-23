@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((fetchArtistTask) != null) {
        fetchArtistTask.cancel(true);
    }
    if ((searchEditText.length()) == 0) {
        mArtistAdapter.getList().clear();
        mArtistAdapter.notifyDataSetChanged();
    }
    mArtistAdapter.getList().clear();
    mArtistAdapter.notifyDataSetChanged();
    fetchArtistTask = new com.example.android.spotifystreamer.MainActivityFragment.FetchArtistsTask();
    fetchArtistTask.execute(searchEditText.getText().toString());
}