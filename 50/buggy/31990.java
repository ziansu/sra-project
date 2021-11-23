@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    java.lang.System.out.println(((("pww: " + (getWidth())) + "phh: ") + (getHeight())));
    width = getWidth();
    init();
    repaint();
}