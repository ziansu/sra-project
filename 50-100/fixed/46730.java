public void search(java.lang.String artist, android.support.v4.app.FragmentTransaction ft) {
    this.artist = artist;
    if ((artistName) != null)
        artistName.setText(artist);
    
    if ((loadBar) != null)
        loadBar.setVisibility(View.VISIBLE);
    
    parser.search(artist.replaceAll(" ", "_"));
    show(ft, "wikiArtistInfo");
}