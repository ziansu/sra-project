@java.lang.Override
public void onLoadMore(int page, int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    if (com.jakester.nytarticlesapp.managers.InternetManager.getInstance(this).isInternetAvailable()) {
        makeArticlesCall(com.jakester.nytarticlesapp.activities.MainActivity.mQuery, 0);
    }else {
        noInternetDialog.show();
    }
}