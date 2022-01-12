@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.util.HashMap<java.lang.String, java.lang.String> c = ((java.util.HashMap<java.lang.String, java.lang.String>) (parent.getItemAtPosition(position)));
    java.lang.String artist = c.get("name");
    if (((loadedArtist) != null) && (loadedArtist.equals(artist))) {
        artist = null;
    }
    loadMediaTracks(artist, null);
    loadMediaAlbums(artist);
}