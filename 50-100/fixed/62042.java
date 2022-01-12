public void setMusicPosition(int position) {
    mMusicBinder.startMusicAction(this, position);
    if ((update) != null) {
        if ((update.getStatus()) == (AsyncTask.Status.PENDING)) {
            update.execute();
        }
    }
}