public static com.obabichev.artists.fragments.ArtistDetailsFragment create(com.obabichev.artists.model.Artist artist) {
    com.obabichev.artists.fragments.ArtistDetailsFragment fragment = new com.obabichev.artists.fragments.ArtistDetailsFragment();
    fragment.artist = artist;
    return fragment;
}