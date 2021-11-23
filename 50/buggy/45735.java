@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((mCurrentBeacon.getStatus()) != (AsyncTask.Status.FINISHED)) {
        mCurrentBeacon.cancel(true);
    }
}