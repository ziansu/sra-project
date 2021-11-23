@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(mTimer);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    handler.sendMessage(new android.os.Message());
}