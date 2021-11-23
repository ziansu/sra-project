public void componentResized(java.awt.event.ComponentEvent e) {
    view.MapScrollPane p = ((view.MapScrollPane) (e.getComponent()));
    p.map.repaint();
    p.getViewport().setViewPosition(p.getCenter());
    p.map.updateDisplay(p.getWidth(), p.getHeight());
}