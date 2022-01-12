private void loadNextDataFilteredSearch(final int offset, final android.support.v7.widget.RecyclerView view) {
    android.util.Log.d(com.codepath.nytimes.activity.NYTimesMainActivity.TAG, ("loadNextDataFromApi and offset is : " + offset));
    java.lang.Runnable runnableCode = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            getFilteredArticleList(mDate, mSort, mCategory1, mCategory2, mCategory3, offset, view);
        }
    };
    handler.postDelayed(runnableCode, TIME_OUT);
}