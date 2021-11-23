@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(sleepTime);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    startActivity(new android.content.Intent(getApplicationContext(), com.inklin.openinwechat.ShiftActivity.class));
    sleepTime += 100;
}