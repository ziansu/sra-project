@java.lang.Override
public boolean requestFocusInWindow() {
    g2p.getCanvas().getCanvasElement().focus();
    focusGained();
    return true;
}