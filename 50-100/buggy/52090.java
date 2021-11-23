@java.lang.Override
public void run() {
    try {
        if (((((displayWindow) != null) && (displayWindow.isFullscreen())) && ((mode) == (main.Microscope.Mode.NORMAL))) && ((info) == null)) {
            windows.ToFront.toFront();
        }
    } catch (java.awt.AWTException e) {
        e.printStackTrace();
    }
}