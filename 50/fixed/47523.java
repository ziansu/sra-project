private void removeLoadingSpinner() {
    if (!(jsonFetcher.isTesting())) {
        if (((loadingSpinner) != null) && (loadingSpinner.isShowing())) {
            loadingSpinner.dismiss();
        }
    }
}