public void componentResized(java.awt.event.ComponentEvent e) {
    view.MapScrollPane p = ((view.MapScrollPane) (e.getComponent()));
    p.map.repaint();
    p.getViewport().setViewPosition(p.getCenter());
    map.updateDisplay(e.getComponent().getWidth(), e.getComponent().getHeight());
}