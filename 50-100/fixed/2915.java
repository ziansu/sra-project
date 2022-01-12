@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (((presenter) != null) && (presenter.isGameOver())) {
        valueAnimator.cancel();
        valueAnimator.start();
    }else {
        valueAnimator.cancel();
        valueAnimator.start();
    }
}