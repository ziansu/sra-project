@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.seanholcomb.spotifystreamer.NowPlayingActivity.class);
    com.example.seanholcomb.spotifystreamer.SpotifyApplication spotifyApplication = ((com.example.seanholcomb.spotifystreamer.SpotifyApplication) (getActivity().getApplicationContext()));
    spotifyApplication.setPosition(position);
    startActivity(intent);
}