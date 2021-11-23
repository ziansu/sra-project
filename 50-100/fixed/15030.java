private void removeFromEnd(final javax.swing.text.Document document, final javax.swing.text.Element root) {
    final int index = (root.getElementCount()) - 1;
    final javax.swing.text.Element line = root.getElement(index);
    final int start = line.getStartOffset();
    final int end = line.getEndOffset();
    try {
        document.remove((start - 1), (end - start));
    } catch (final javax.swing.text.BadLocationException ble) {
    }
}