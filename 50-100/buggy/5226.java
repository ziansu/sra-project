private void showError(int code) {
    setSwipeRefreshLayoutState(true, false);
    showVehicleList(false);
    switch (code) {
        case io.levelsoftware.carculator.sync.BaseIntentService.STATUS_ERROR_NO_NETWORK :
            showErrorSnackbar(R.string.error_no_network, false);
            showStatusImage(R.drawable.ic_logo_no_network);
            break;
        case io.levelsoftware.carculator.sync.BaseIntentService.STATUS_ERROR_NETWORK_ISSUE :
            showErrorSnackbar(R.string.error_network_error, true);
            showStatusImage(R.drawable.ic_logo_no_network);
            break;
        default :
            showErrorSnackbar(R.string.error_data, true);
            showStatusImage(R.drawable.ic_logo_error);
    }
}