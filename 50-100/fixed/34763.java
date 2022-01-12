public void play() {
    if ((mySound) == null) {
        mySound = android.media.MediaPlayer.create(this, R.raw.fightsong);
        mySound.start();
    }else {
        mySound.seekTo(0);
        mySound.start();
    }
}