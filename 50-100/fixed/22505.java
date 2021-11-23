@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.sahelmastoureshgh.spotifystream.Singer clickedSinger = singerAdapter.getItem(position);
    android.content.Intent songIntent = new android.content.Intent(getActivity(), com.sahelmastoureshgh.spotifystream.TopSongActivity.class).putExtra(Intent.EXTRA_TEXT, clickedSinger.getId()).putExtra(Intent.EXTRA_REFERRER_NAME, clickedSinger.getName());
    startActivity(songIntent);
}