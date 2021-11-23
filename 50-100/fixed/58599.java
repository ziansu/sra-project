@java.lang.Override
public void run() {
    if (createConnection(deviceArray.get(which))) {
        buttonStartStop.setBackgroundResource(R.drawable.stop_68);
        isRunning = true;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                startLiveData();
            }
        });
    }
    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            buttonStartStop.setAnimation(null);
        }
    });
}