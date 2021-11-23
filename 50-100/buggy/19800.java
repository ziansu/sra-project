private void updateUI() {
    if (!(this.success)) {
        android.widget.Toast.makeText(getApplicationContext(), getString(R.string.http_call_error), Toast.LENGTH_SHORT).show();
    }else {
        com.danidevelop.lyricsoffline.adapters.SongAdapter adapter = new com.danidevelop.lyricsoffline.adapters.SongAdapter(getApplicationContext(), this.listSong, R.layout.item_list_search, this);
        this.searchListView.setAdapter(adapter);
    }
    findViewById(R.id.loadingPanel).setVisibility(View.GONE);
}