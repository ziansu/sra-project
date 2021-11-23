private void updateSeekbarAndTime(int progressMs, int durationMs) {
    if (!(isSeeking)) {
        elapse.setText(android.text.format.DateUtils.formatElapsedTime((progressMs / 1000L)));
        if (durationMs > 0) {
            seekBar.setProgress(((progressMs * 100) / durationMs));
        }else {
            seekBar.setProgress(durationMs);
        }
    }
    if (durationMs >= 0) {
        trackTime.setText(android.text.format.DateUtils.formatElapsedTime((durationMs / 1000L)));
    }
}