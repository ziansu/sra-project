@java.lang.Override
protected void mouseReleased(int mouseX, int mouseY, int state) {
    if (((selected) != null) && (mouseHeld)) {
        mouseHeld = false;
        selected.savePosition();
        deselectButton();
        initGui();
    }
    super.mouseReleased(mouseX, mouseY, state);
}