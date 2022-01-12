public void stopLoading() {
    isLoading = false;
    valueAnimator.end();
    valueAnimator.cancel();
    isStop = true;
    setText(text);
}