public void run() {
    intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
    edu.berkeley.cs.amplab.carat.android.CaratApplication.sampler = edu.berkeley.cs.amplab.carat.android.sampling.Sampler.getInstance();
    try {
        unregisterReceiver(edu.berkeley.cs.amplab.carat.android.CaratApplication.sampler);
    } catch (java.lang.IllegalArgumentException e) {
    }
    registerReceiver(edu.berkeley.cs.amplab.carat.android.CaratApplication.sampler, intentFilter);
    intentFilter.addAction(Intent.ACTION_SCREEN_ON);
    registerReceiver(edu.berkeley.cs.amplab.carat.android.CaratApplication.sampler, intentFilter);
    intentFilter.addAction(Intent.ACTION_SCREEN_OFF);
    registerReceiver(edu.berkeley.cs.amplab.carat.android.CaratApplication.sampler, intentFilter);
}