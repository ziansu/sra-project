@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if (s != null) {
        showSeries(s, gridAdapter, true);
    }
    swipeView.setRefreshing(false);
}