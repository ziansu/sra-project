@java.lang.Override
public void toggleFullScreen() {
    if (isFullScreen_) {
        forceClosed();
        displayBus_.post(new org.micromanager.display.internal.events.FullScreenEvent(this, getScreenConfig(), false));
    }else {
        setVisible(false);
        org.micromanager.display.DisplayWindow fullFrame = new org.micromanager.display.internal.DefaultDisplayWindow(store_, customControls_, displaySettings_, true);
    }
}