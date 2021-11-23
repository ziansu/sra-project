public void pauseSong() {
    if ((mp) != null)
        if (mp.isPlaying()) {
            mp.pause();
            duration = mp.getCurrentPosition();
            pause = true;
        }
    
}