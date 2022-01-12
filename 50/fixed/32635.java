@java.lang.Override
public void run() {
    while (true) {
        repaint();
        try {
            java.lang.Thread.sleep(1);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}