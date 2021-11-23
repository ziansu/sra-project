private void refreshData() {
    new org.axdev.cpuspy.fragments.TimerFragment.RefreshStateDataTask().execute(((java.lang.Void) (null)));
    if ((mSwipeLayout) != null)
        mSwipeLayout.setRefreshing(false);
    
}