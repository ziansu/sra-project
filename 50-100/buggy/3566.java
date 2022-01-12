public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    com.popularmovie.android.appprotfolio.popularmovie.Movie movie = ((com.popularmovie.android.appprotfolio.popularmovie.Movie) (adapter.getItem(position)));
    android.util.Log.d(com.popularmovie.android.appprotfolio.popularmovie.MainActivityFragment.LOG_TAG, movie.getId());
    android.content.Intent intent = new android.content.Intent(getActivity(), com.popularmovie.android.appprotfolio.popularmovie.MovieDetailsActivity.class);
    intent.putExtra(MovieConstants.CUSTOM_LISTING, movie);
    startActivity(intent);
}