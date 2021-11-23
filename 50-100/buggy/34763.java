public void play() {
    if ((mySound) == null) {
        mySound = android.media.MediaPlayer.create(this, R.raw.fightsong);
        mySound.start();
    }else
        if (!(mySound.isPlaying())) {
            mySound.seekTo(paused);
            mySound.start();
        }
    
}