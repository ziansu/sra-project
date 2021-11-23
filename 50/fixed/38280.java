private void pausePlay() {
    mp.pause();
    updateUIHandler.removeCallbacks(updateUIRunnable);
    popNotification();
}