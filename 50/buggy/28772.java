@java.lang.Override
public void onDataUpdated(boolean successful) {
    if (!successful) {
        setRefreshing(false);
        mView.showMessage(R.string.snackbar_error_update_stocks);
    }
}