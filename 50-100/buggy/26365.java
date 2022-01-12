@java.lang.Override
public void onResume() {
    super.onResume();
    com.execube.genesis.utils.EventBus.getBus().register(this);
    dataSource.open();
    android.util.Log.v(com.execube.genesis.views.fragments.FavouritesFragment.TAG, "Favourite OnResume");
    mMovies = dataSource.getAllMovies();
    mAdapter = new com.execube.genesis.views.fragments.FavouritesFragment.FavouritesAdapter();
    mFavouritesRecyclerView.setAdapter(mAdapter);
    mFavouritesRecyclerView.invalidate();
}