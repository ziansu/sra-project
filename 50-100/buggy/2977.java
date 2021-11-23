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
            android.widget.Toast.makeText(getApplicationContext(), ((getString(R.string.exception)) + (e.getLocalizedMessage())), Toast.LENGTH_SHORT).show();
        }
    }
}