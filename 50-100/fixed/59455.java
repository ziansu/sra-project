private void customizeViews() {
    if (((placeHolderManager) != null) && (!(viewsAreCustomized))) {
        customizeViews.customize(context, viewLoading, viewEmpty, viewEmptyImage, viewEmptyMessage, viewEmptyTryAgainButton, viewError, viewErrorImage, viewErrorMessage, viewErrorTryAgainButton);
        viewsAreCustomized = true;
    }
}