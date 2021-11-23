private void loadData() {
    if (isOnline()) {
        errorText.setText(R.string.error_message);
        posterAdapter.setAllMoviesOnPage(null);
        showMovieData();
        new com.kacper.popularmovies.FetchMovieVolley(this).getRequest(actualSortingOrder, this);
    }else {
        errorText.setText(R.string.internet_error);
        showErrorMessage(null);
    }
}