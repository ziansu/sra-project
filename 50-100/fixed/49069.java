@org.androidannotations.annotations.Click(value = R.id.playPause)
void playPause() {
    android.view.KeyEvent event = new android.view.KeyEvent(android.view.KeyEvent.ACTION_DOWN, android.view.KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE);
    _audioManager.dispatchMediaKeyEvent(event);
    android.view.KeyEvent event2 = new android.view.KeyEvent(android.view.KeyEvent.ACTION_UP, android.view.KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE);
    _audioManager.dispatchMediaKeyEvent(event2);
    if (_audioManager.isMusicActive()) {
        playPause.setImageDrawable(getResources().getDrawable(R.drawable.ic_play_arrow_black_24dp, null));
    }else {
        playPause.setImageDrawable(getResources().getDrawable(R.drawable.ic_pause_black_24dp, null));
    }
}