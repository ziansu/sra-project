private void makeLouderExplosion() {
    final android.media.MediaPlayer mp = android.media.MediaPlayer.create(this, R.raw.sunk);
    android.util.Log.v("Ship has been sunk", "Ka-baam");
    mp.start();
}