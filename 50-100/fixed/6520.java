public void writeCharacters(final char[] aText, final int nStart, final int nLen) throws javax.xml.stream.XMLStreamException {
    debug(() -> ((((("writeCharacters (" + (java.lang.String.valueOf(aText, nStart, nLen))) + ", ") + nStart) + ", ") + nLen) + ")");
    _elementStartClose();
    m_aEmitter.onText(aText, nStart, nLen);
}