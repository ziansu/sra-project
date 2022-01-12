private void maximize() {
    restoreWindowWidth = getWidth();
    restoreWindowHeight = getHeight();
    restoreWindowX = getX();
    restoreWindowY = getY();
    setWidth(getScreen().getWidth());
    setHeight(((application.getDesktopBottom()) - 1));
    setX(0);
    setY(1);
    maximized = true;
}