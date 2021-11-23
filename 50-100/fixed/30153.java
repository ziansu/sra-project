private void loadNextDataFilteredSearch(final int offset, final android.support.v7.widget.RecyclerView view) {
    java.lang.Runnable runnableCode = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            getFilteredArticleList(query, mDate, mSort, mCategory1, mCategory2, mCategory3, offset, view);
        }
    };
    handler.postDelayed(runnableCode, TIME_OUT);
}