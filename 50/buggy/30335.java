@java.lang.Override
public void processWindowEvent(java.awt.event.WindowEvent e) {
    if ((e.getID()) == (java.awt.event.WindowEvent.WINDOW_CLOSING)) {
        closingOperations.start();
        dispose();
    }
}