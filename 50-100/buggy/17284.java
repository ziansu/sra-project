public void onPlayPause(android.view.View view) {
    if (playing) {
        playing = false;
        stopRunnable();
        musicService.pause();
        play.setImageResource(R.drawable.play);
    }else {
        playing = true;
        startRunnable();
        musicService.play();
        play.setImageResource(R.drawable.pause);
    }
    setPlayerTitleText();
}