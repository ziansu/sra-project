public static com.obabichev.artists.fragments.ArtistDetailsFragment create(android.content.Context context, com.obabichev.artists.model.Artist artist) {
    com.obabichev.artists.fragments.ArtistDetailsFragment fragment = new com.obabichev.artists.fragments.ArtistDetailsFragment();
    fragment.artist = artist;
    fragment.context = context;
    return fragment;
}