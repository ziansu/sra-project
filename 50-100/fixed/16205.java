private void startService() {
    android.content.Intent i = new android.content.Intent(this, com.exams.demo10_lbs.LBSService.class);
    this.startService(i);
    android.util.Log.i(com.exams.demo10_lbs.MainActivity.TAG, "in startService method.");
    if ((dataReceiver) == null) {
        dataReceiver = new com.exams.demo10_lbs.MainActivity.DataReceiver();
        android.content.IntentFilter filter = new android.content.IntentFilter();
        filter.addAction("com.exams.demo10_lbs");
        registerReceiver(dataReceiver, filter);
    }
}