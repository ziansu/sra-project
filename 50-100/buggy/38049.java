@java.lang.Override
public void windowActivated(java.awt.event.WindowEvent e) {
    org.pmw.tinylog.Logger.debug("Main frame gained focus");
    controlFrame.setFocusableWindowState(false);
    logFrame.setFocusableWindowState(false);
    controlFrame.toFront();
    logFrame.toFront();
    frame.requestFocus();
    controlFrame.setFocusableWindowState(true);
    logFrame.setFocusableWindowState(true);
}