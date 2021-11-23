public void refreshMovieInfo(com.example.android.popularmovies.MovieInfo result) {
    mLoadProgressSpinner.setVisibility(View.GONE);
    if (result == null) {
        android.widget.Toast.makeText(getActivity(), R.string.load_movie_info_failed, Toast.LENGTH_SHORT).show();
        return ;
    }
    mMovieInfo = result;
    android.view.View fragmentView = getView();
    if (fragmentView == null) {
        return ;
    }
    setViewData(fragmentView);
}