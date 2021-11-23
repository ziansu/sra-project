public void startLoading() {
    if (((valueAnimator) != null) && (!(loaderView.valueSet()))) {
        valueAnimator.cancel();
        init();
        valueAnimator.start();
    }
}