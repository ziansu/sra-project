private void stop() {
    try {
        mp.stop();
        pb.setProgress(0);
        tiempo.setText("0:00");
        songPlayerThread.cancelmusicplayer = true;
    } catch (java.lang.IllegalStateException e) {
        android.util.Log.e(TAG, ("Unable to play audio queue do to exception: " + (e.getMessage())), e);
    }
}