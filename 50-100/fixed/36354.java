void hideAllWindows() {
    if ((offlineWindow) != null)
        offlineWindow.dispatchEvent(new java.awt.event.WindowEvent(offlineWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
    
    if ((onlineWindow) != null)
        onlineWindow.dispatchEvent(new java.awt.event.WindowEvent(onlineWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
    
    if ((whatifWindow) != null)
        whatifWindow.dispatchEvent(new java.awt.event.WindowEvent(whatifWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
    
    if ((reportWindow) != null)
        reportWindow.dispatchEvent(new java.awt.event.WindowEvent(reportWindow, java.awt.event.WindowEvent.WINDOW_CLOSING));
    
}