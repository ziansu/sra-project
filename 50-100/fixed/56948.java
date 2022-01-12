@java.lang.Override
protected void mouseReleased(int mouseX, int mouseY, int state) {
    if (((selected) != null) && (mouseHeld)) {
        selected.mouseReleased(mouseX, mouseY);
        mouseHeld = false;
        deselectButton();
    }
    super.mouseReleased(mouseX, mouseY, state);
}