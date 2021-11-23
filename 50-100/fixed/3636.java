private void skipSection(java.lang.String localName) {
    try {
        for (int e = parser.next(); e != (javax.xml.stream.XMLStreamConstants.END_DOCUMENT); e = parser.next()) {
            if ((e == (javax.xml.stream.XMLStreamConstants.END_ELEMENT)) && (parser.getLocalName().equals(localName))) {
                break;
            }
        }
    } catch (javax.xml.stream.XMLStreamException ex) {
        java.lang.System.err.println(ex);
    }
}