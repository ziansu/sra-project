private void setController() {
    controller = new com.chopin.MusicController(this);
    controller.setMediaPlayer(this);
    controller.setAnchorView(findViewById(R.id.song_list));
    controller.setEnabled(true);
    controller.setPrevNextListeners(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            playNext();
        }
    }, new android.view.View.OnClickListener() {
        public void onClick(android.view.View v) {
            playPrev();
        }
    });
}