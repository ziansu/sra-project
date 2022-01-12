public final void stop() {
    if ((isPlaying()) && (device)) {
        clip.stop();
    }
    playing = false;
}