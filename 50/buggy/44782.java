public void seekTo(final int millis) {
    playHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mediaPlayer.seekTo(millis);
        }
    });
}