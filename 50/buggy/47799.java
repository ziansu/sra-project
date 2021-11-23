private void startPlay() {
    mp.start();
    updateUIHandler.removeCallbacks(updateUIRunnable);
    updateUIHandler.post(updateUIRunnable);
    popNotification(musics.get(current));
}