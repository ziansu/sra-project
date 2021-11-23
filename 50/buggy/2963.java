@java.lang.Override
public void run() {
    setDaemon(true);
    try {
        java.lang.Thread.sleep(t);
        edit.repaint();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}