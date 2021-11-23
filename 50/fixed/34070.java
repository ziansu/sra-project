public void startLoading() {
    if (((valueAnimator) != null) && (!(loaderView.valueSet()))) {
        init();
        valueAnimator.start();
    }
}