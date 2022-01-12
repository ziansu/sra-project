@java.lang.Override
public void onDestroy() {
    mListView.removeOnScrollListener(viewScrollListener);
    if ((mPopularMovieViewPresenter) != null) {
        mPopularMovieViewPresenter.destroy();
        mPopularMovieViewPresenter = null;
    }
    super.onDestroy();
}