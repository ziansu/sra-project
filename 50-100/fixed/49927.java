@java.lang.Override
public void onLoad(int totalItemCount) {
    mMovieAdapter.setFooterVisibility(true);
    if (totalItemCount == ((com.udacity.popmovies.Utility.getTotalMoviesNum(getActivity())) + 1)) {
        mMovieAdapter.updateFooterView(MovieAdapter.NO_MORE_LOAD);
        return ;
    }
    mMovieAdapter.updateFooterView(MovieAdapter.IS_LOADING);
    mMovieNetHelper.loadMoreMovies();
}