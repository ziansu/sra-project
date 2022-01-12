@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    mDefaultColor = mRegularPrice.getCurrentTextColor();
    mSwipeLayout.setRefreshing(true);
}