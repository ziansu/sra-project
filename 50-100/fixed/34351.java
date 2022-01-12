@java.lang.Override
public final void endElement(java.lang.String uri, java.lang.String local, java.lang.String prefixed) throws org.xml.sax.SAXException {
    endElement(local);
    if ((--(nested)) == (-1)) {
        org.xml.sax.ContentHandler prev = context.pop();
        prev.endElement(uri, local, prefixed);
    }
}