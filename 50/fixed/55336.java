void removeWindow(net.mready.hover.HoverWindow window) {
    setNotification(window, null);
    hideWindow(window);
    window.performDestroy();
    windows.remove(window.windowId);
}