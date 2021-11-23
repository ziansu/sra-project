public void callHandler() {
    handler = new android.os.Handler();
    com.example.clock.stopwatchActivity.updateTimer my_update = new com.example.clock.stopwatchActivity.updateTimer();
    handler.postDelayed(my_update, 1000);
}