@java.lang.Override
public void onDestroy() {
    if ((mListView) != null) {
        mListView.removeOnScrollListener(viewScrollListener);
    }
    if ((mPopularMovieViewPresenter) != null) {
        mPopularMovieViewPresenter.destroy();
        mPopularMovieViewPresenter = null;
    }
    super.onDestroy();
}