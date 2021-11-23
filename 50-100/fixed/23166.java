private int findInLine(final org.obicere.bytecode.viewer.dom.Line line, final java.lang.String search, final boolean ignoreCase, final int end) {
    java.lang.String nextText = line.getText();
    if (ignoreCase) {
        nextText = nextText.toLowerCase();
    }
    if (end == (-1)) {
        return nextText.lastIndexOf(search);
    }
    return nextText.lastIndexOf(search, (end - 1));
}