private boolean isNextCharEscapeableNameChar() throws org.eclipse.jface.text.BadLocationException {
    return (((offset) + 1) < (endOffset)) && (org.jboss.ide.eclipse.freemarker.lang.ParserUtils.isEscapeableNameChar(document.getChar(((offset) + 1))));
}