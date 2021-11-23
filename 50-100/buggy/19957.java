private void stopService() {
    android.content.Intent i = new android.content.Intent(this, com.exams.demo10_lbs.LBSService.class);
    this.stopService(i);
    android.util.Log.i(com.exams.demo10_lbs.MainActivity.TAG, "in stopService method.");
    if ((dataReceiver) != null) {
        unregisterReceiver(dataReceiver);
        dataReceiver = null;
        mStarted = false;
    }
}