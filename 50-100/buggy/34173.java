public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    if ((isText) && (isTitle)) {
        title = new java.lang.String(ch, start, length);
    }
    if ((isText) && (isBody)) {
        text += new java.lang.String(ch, start, length);
    }
}