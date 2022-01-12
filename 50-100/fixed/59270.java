@java.lang.Override
public void run() {
    while (isRunning) {
        android.os.Message msg = new android.os.Message();
        msg.arg1 = count;
        mHandler.sendMessage(msg);
        (count)++;
        if ((count) == 101) {
            isRunning = false;
            count = 0;
        }
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}