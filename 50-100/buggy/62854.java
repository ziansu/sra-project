@java.lang.Override
public void run() {
    while ((countDown) >= 0) {
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        (countDown)--;
        if ((countDown) == 0) {
            android.os.Message msg = new android.os.Message();
            msg.what = com.usr.thermostat.MainActivity.TIMEUP;
            CounterHandler.sendMessage(msg);
            countDown = com.usr.thermostat.MainActivity.countDownTime;
        }
    } 
}