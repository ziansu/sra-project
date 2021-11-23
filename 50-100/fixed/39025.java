@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String searchText = edit.getText().toString();
    if (!(searchText.isEmpty())) {
        com.dustancurtis.droid.spotifystreamer.SearchSpotifyActivityFragment.hideKeyboard(c, edit.getWindowToken());
        final com.dustancurtis.droid.spotifystreamer.SearchSpotifyActivityFragment.SearchSpotifyTask task = new com.dustancurtis.droid.spotifystreamer.SearchSpotifyActivityFragment.SearchSpotifyTask();
        task.execute(edit.getText().toString());
    }
}