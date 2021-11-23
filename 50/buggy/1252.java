public void seekUpdation() {
    if ((mp) != null) {
        if (mp.isPlaying()) {
            seekBar.setProgress(mp.getCurrentPosition());
            seekHandler.postDelayed(run, 10);
        }
    }
}