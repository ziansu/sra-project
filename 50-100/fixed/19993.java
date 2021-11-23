public void handleMousePressed(int x, int y) {
    java.lang.System.out.println(((("Window manager - Mouse pressed with x " + x) + " and y ") + y));
    lastMouseY = y;
    lastMouseX = x;
    if ((currentActiveWindow) == null) {
        setActiveWindow(x, y);
    }
    if ((currentActiveWindow) != null) {
        windowSystem.getListWindows().remove(currentActiveWindow);
        windowSystem.getListWindows().add(currentActiveWindow);
        windowSystem.requestRepaint();
    }
    currentActiveWindow = null;
}