private void stop() {
    if ((mp) != null) {
        try {
            if (mp.isPlaying()) {
                mp.pause();
            }
            mp.seekTo(0);
        } catch (java.lang.Exception e) {
        }
    }
}