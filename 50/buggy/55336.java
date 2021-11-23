void removeWindow(net.mready.hover.HoverWindow window) {
    checkWindow(window);
    setNotification(window, null);
    hideWindow(window);
    window.performDestroy();
    windows.remove(window.windowId);
}