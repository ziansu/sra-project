private void showFavButton() {
    mFavButton.setOnFavoriteChangeListener(null);
    mFavButton.setFavorite(mAppUser.getFavouritesIds().contains(mChannel.getId()), false);
    mFavButton.setVisibility(View.VISIBLE);
}