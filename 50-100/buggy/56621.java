public static com.despedo.rss_msrcedes.fragment.FavouritesFragment getInstance(android.content.Context context, java.util.List<com.despedo.rss_msrcedes.dto.NewsDTO> data) {
    android.os.Bundle args = new android.os.Bundle();
    com.despedo.rss_msrcedes.fragment.FavouritesFragment fragment = new com.despedo.rss_msrcedes.fragment.FavouritesFragment();
    fragment.setArguments(args);
    fragment.setContext(context);
    fragment.setTitle(context.getString(R.string.favourites));
    fragment.setData(data);
    return fragment;
}