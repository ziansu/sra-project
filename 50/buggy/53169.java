public void makeExplosionSound(android.content.Context context) {
    if ((mp) != null) {
        mp.stop();
        mp.release();
    }
    mp = android.media.MediaPlayer.create(context, R.raw.torpedo);
    mp.start();
}