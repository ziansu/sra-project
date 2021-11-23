public void stop() {
    picturePolling.stop();
    if ((animation) != null) {
        animation.stop();
        animation = null;
    }
}