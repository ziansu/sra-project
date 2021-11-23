@java.lang.Override
public void onLoadMore(int page, int totalItemsCount) {
    try {
        android.util.Log.d("PAGE", java.lang.Integer.toString(page));
        getMovies(page);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}