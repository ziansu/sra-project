@java.lang.Override
public void windowClosed(java.awt.event.WindowEvent arg0) {
    while (true) {
        if (isDone) {
            java.lang.System.exit(0);
        }
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException ie) {
            ie.printStackTrace();
        }
    } 
}