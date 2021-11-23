@java.lang.Override
public void run() {
    --(leftTime);
    if ((leftTime) < 0) {
        countdownTimer.cancel();
        countdownTimer.purge();
        handler.post(updateLeftTimeRunnable);
        handler.post(showResultRunnable);
    }else {
        handler.post(updateLeftTimeRunnable);
    }
}