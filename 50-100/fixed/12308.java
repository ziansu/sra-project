@java.lang.Override
public void frameLogic() {
    java.awt.Graphics2D g = ((java.awt.Graphics2D) (bufferStrategy.getDrawGraphics()));
    g.setRenderingHint(java.awt.RenderingHints.KEY_TEXT_ANTIALIASING, java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    g.setRenderingHint(java.awt.RenderingHints.KEY_RENDERING, java.awt.RenderingHints.VALUE_RENDER_SPEED);
    try {
        zeichner.render(g);
    } finally {
        g.dispose();
    }
    try {
        bufferStrategy.show();
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    }
}