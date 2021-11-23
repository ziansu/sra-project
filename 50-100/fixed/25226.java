@java.lang.Override
public void onFavoriteMoviesListInteraction(com.henriquenfaria.popularmovies.model.Movie movieItem) {
    if (movieItem != null) {
        if (mIsTwoPane) {
            com.henriquenfaria.popularmovies.ui.DetailsFragment detailsFragment = com.henriquenfaria.popularmovies.ui.DetailsFragment.newInstance(movieItem);
            getSupportFragmentManager().beginTransaction().replace(R.id.details_fragment_container, detailsFragment).commit();
        }else {
            android.content.Intent intent = new android.content.Intent(this, com.henriquenfaria.popularmovies.ui.DetailsActivity.class).putExtra(Constants.EXTRA_MOVIE, movieItem);
            startActivity(intent);
        }
    }
}