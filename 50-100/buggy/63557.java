@java.lang.Override
public void linesRemoved(java.util.List<kkckkc.syntaxpane.model.LineManager.Line> lines) {
    repaint(kkckkc.syntaxpane.MiniMapPanel.REPAINT_DELAY, 0, (((lines.get(0).getIdx()) * (kkckkc.syntaxpane.MiniMapPanel.PIXELS_PER_LINE)) - 1), getWidth(), getHeight());
}