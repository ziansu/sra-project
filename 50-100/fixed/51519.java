public void processNews(int page, int category, java.util.ArrayList<com.java.zu26.data.News> newslist) {
    if (newslist.isEmpty()) {
        android.util.Log.d("TAG", "empty: ");
        mNewsView.showNoNews(page, category, newslist);
    }else {
        android.util.Log.d("TAG", "not empty: ");
        mNewsView.showNews(page, category, newslist);
    }
}