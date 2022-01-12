private void playpause() {
    if ((mp) != null) {
        try {
            if (mp.isPlaying()) {
                mp.pause();
                btnPlay.setImageResource(android.R.drawable.ic_media_play);
            }else {
                mp.start();
                btnPlay.setImageResource(android.R.drawable.ic_media_pause);
            }
        } catch (java.lang.Exception e) {
        }
    }
}