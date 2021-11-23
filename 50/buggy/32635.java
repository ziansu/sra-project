@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(3000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    while (true) {
        repaint();
    } 
}