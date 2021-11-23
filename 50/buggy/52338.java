@java.lang.Override
public void removeProgressBottomGrid() {
    this.endlessScrollListener.removeProgressItem();
    this.rvMoviesFeed.post(() -> adapter.removeProgress());
}