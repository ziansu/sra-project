private void dispatchOnTick(final long millisUntilFinished) {
    if ((onScoreboardChangeListener) != null) {
        onScoreboardChangeListener.onCountDownTick(millisUntilFinished);
    }
}