@java.lang.Override
public void onBindViewHolder(ke.co.emichira.muziki.adapters.SongsListAdapter.AllSongsGridHolder allSongsGridHolder, int i) {
    ke.co.emichira.muziki.models.Song allSongsItem = allSongsList.get(i);
    allSongsGridHolder.title.setText(allSongsItem.getTitle());
    allSongsGridHolder.artist.setText(allSongsItem.getArtist());
}