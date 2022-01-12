void hideAllWindows() {
    offlineWindow.dispatchEvent(new java.awt.event.WindowEvent(offlineWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
    onlineWindow.dispatchEvent(new java.awt.event.WindowEvent(offlineWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
    whatifWindow.dispatchEvent(new java.awt.event.WindowEvent(offlineWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
    reportWindow.dispatchEvent(new java.awt.event.WindowEvent(offlineWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
}