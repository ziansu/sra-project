@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(t);
        edit.repaint();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}