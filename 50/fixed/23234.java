private void handleError(java.lang.Throwable throwable) {
    if ((view) != null) {
        view.showError();
        view.hideLoading();
    }
}