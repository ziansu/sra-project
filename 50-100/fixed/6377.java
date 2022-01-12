@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (com.framgia.moviedb.Constant.MOVIES_ACTIVITY_REQUEST_CODE)) && (resultCode == (RESULT_OK))) {
        com.framgia.moviedb.data.model.Movie movie = ((com.framgia.moviedb.data.model.Movie) (data.getSerializableExtra(MovieDetailActivity.EXTRA_MOVIE)));
        int position = data.getIntExtra(MovieDetailActivity.EXTRA_POSITION, MovieDetailActivity.DEFAULT_POSITION);
        mVerticalMovieAdapter.get().updateItem(position, movie);
        removeItemFavorite(position, movie);
    }
}