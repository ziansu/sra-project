public void mouseExited(java.awt.event.MouseEvent e) {
    engine.input.Mouse.recentClick = e.getPoint();
    engine.input.Mouse.recentClickTime = java.lang.System.currentTimeMillis();
}