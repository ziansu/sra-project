@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(time);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    context.runOnUiThread(new com.rubengees.vocables.utils.Utils.MyRunnable(listener));
}