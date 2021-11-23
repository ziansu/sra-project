@java.lang.Override
public void linesRemoved(java.util.List<kkckkc.syntaxpane.model.LineManager.Line> lines) {
    int start = ((lines.get(0).getIdx()) * (kkckkc.syntaxpane.MiniMapPanel.PIXELS_PER_LINE)) - 1;
    repaint(kkckkc.syntaxpane.MiniMapPanel.REPAINT_DELAY, 0, start, getWidth(), getHeight());
}