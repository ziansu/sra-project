@java.lang.Override
public void onClick(android.view.View v) {
    Config.start.setEnabled(true);
    Config.pause.setEnabled(false);
    Config.myTcpTest.on_off = false;
    Config.myTcpTest2.on_off = false;
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}