private void doVibrate(int minutes, final int _vibrationStrength) {
    if (minutes > 0) {
        java.lang.Runnable vibrationRunnable = new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                setVibrationStart(_vibrationStrength, 1000);
            }
        };
        alarmHandler.postDelayed(vibrationRunnable, java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes));
    }else
        setVibrationStart(_vibrationStrength, 1000);
    
}