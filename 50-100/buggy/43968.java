private void highlight(int start, int end, java.awt.Color color) throws javax.swing.text.BadLocationException {
    javax.swing.text.Highlighter hl = expressions.getHighlighter();
    if ((highlight) != null) {
        hl.removeHighlight(highlight);
    }
    javax.swing.text.Highlighter.HighlightPainter p = new javax.swing.text.DefaultHighlighter.DefaultHighlightPainter(color);
    highlight = hl.addHighlight(start, end, p);
}