@java.lang.Override
protected void onResume() {
    super.onResume();
    java.lang.String currentSearchOrder = com.thiago.popularmovies.Utility.getSortOrder(this);
    if ((currentSearchOrder != null) && (!(currentSearchOrder.equalsIgnoreCase(mSearchOrder)))) {
        com.thiago.popularmovies.fragments.MovieGridFragment fragment = ((com.thiago.popularmovies.fragments.MovieGridFragment) (getSupportFragmentManager().findFragmentById(R.id.fragment_movie_grid)));
        if (fragment != null) {
            fragment.changedSearchOrder();
        }
        mSearchOrder = currentSearchOrder;
    }
}