public void search(java.lang.String titles, android.support.v4.app.FragmentTransaction ft) {
    artistName.setText(titles);
    java.lang.String artist = titles.replace(" ", "_");
    loadBar.setVisibility(View.VISIBLE);
    parser.search(titles);
    show(ft, "wikiArtistInfo");
}