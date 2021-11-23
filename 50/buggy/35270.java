public void stopLoading() {
    isLoading = false;
    valueAnimator.end();
    valueAnimator.cancel();
    valueAnimator = null;
    isStop = true;
    setText(text);
}