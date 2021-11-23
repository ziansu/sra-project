private void updateUI() {
    if ((this.listSong.size()) == 0) {
        android.widget.Toast.makeText(getApplicationContext(), getString(R.string.http_call_error), Toast.LENGTH_SHORT).show();
    }else {
        com.danidevelop.lyricsoffline.adapters.SongAdapter adapter = new com.danidevelop.lyricsoffline.adapters.SongAdapter(getApplicationContext(), this.listSong, R.layout.item_list_search, this);
        this.searchListView.setAdapter(adapter);
    }
    findViewById(R.id.loadingPanel).setVisibility(View.GONE);
}