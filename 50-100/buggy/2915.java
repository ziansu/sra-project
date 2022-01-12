@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (((presenter) != null) && (presenter.isGameOver())) {
        presenter.startGame();
        valueAnimator.cancel();
        valueAnimator.start();
    }else {
        valueAnimator.cancel();
        valueAnimator.start();
    }
}