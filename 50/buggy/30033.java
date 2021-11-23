public void stop() {
    if ((mp) != null) {
        android.media.MediaPlayer mpTemp = mp;
        mp = null;
        mpTemp.stop();
        mpTemp.release();
    }
}