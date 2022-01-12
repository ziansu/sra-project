@java.lang.Override
public org.eclipse.che.ide.jseditor.client.text.TextRange getTextRangeForLine(final int line) {
    final int startOffset = this.textViewOverlay.getModel().getLineStart(line);
    final int endOffset = this.textViewOverlay.getModel().getLineEnd(line);
    final int length = endOffset - startOffset;
    return new org.eclipse.che.ide.jseditor.client.text.TextRange(new org.eclipse.che.ide.jseditor.client.text.TextPosition(line, 0), new org.eclipse.che.ide.jseditor.client.text.TextPosition(line, (length - 1)));
}