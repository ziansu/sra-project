@java.lang.Override
public void onRequestFailure(com.octo.android.robospice.persistence.exception.SpiceException spiceException) {
    super.onRequestFailure(spiceException);
    getSwipeRefreshLayout().setRefreshing(false);
}