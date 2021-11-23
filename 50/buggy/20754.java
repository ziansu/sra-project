@java.lang.Override
public void run() {
    f.setVisible(aShowFrame);
    com.parse4cn1.test.javaapplication.CN1TestJavaApplication.runTests();
    f.dispatchEvent(new java.awt.event.WindowEvent(f, java.awt.event.WindowEvent.WINDOW_CLOSING));
}