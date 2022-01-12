public void setMusicPosition(int position) {
    if ((update.getStatus()) == (AsyncTask.Status.PENDING)) {
        update.execute();
    }
    android.util.Log.i(TAG, ("setMusicPosition: " + (update.getStatus())));
    mMusicBinder.startMusicAction(this, position);
}