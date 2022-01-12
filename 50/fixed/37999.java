@java.lang.Override
public void onLoadMore(int page, int totalItemsCount) {
    try {
        getMovies(page);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}