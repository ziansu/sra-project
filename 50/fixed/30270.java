@java.lang.Override
protected void onStop() {
    if ((mFavorites) != null) {
        com.garpr.android.misc.FavoritesStore.write(mFavorites);
    }
    super.onStop();
}