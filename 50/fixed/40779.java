private void fetchFavorites() {
    mRefreshLayout.setRefreshing(true);
    com.charlesmadere.hummingbird.networking.Api.getFavoriteAnime(mUser.getName(), new com.charlesmadere.hummingbird.fragments.FavoriteAnimeFragment.GetFavoritesListener(this));
}