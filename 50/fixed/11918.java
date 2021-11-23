@java.lang.Override
public void onRequestFailure(com.octo.android.robospice.persistence.exception.SpiceException spiceException) {
    super.onRequestFailure(spiceException);
    if ((getView()) != null) {
        getSwipeRefreshLayout().setRefreshing(false);
    }
}