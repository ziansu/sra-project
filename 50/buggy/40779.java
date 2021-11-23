private void fetchFavorites() {
    mRefreshLayout.setRefreshing(true);
    com.charlesmadere.hummingbird.networking.Api.getFavoriteAnime(mUser, new com.charlesmadere.hummingbird.fragments.FavoriteAnimeFragment.GetFavoritesListener(this));
}