@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    if (isWithinBodyElement) {
        bodyText.append(ch, start, length);
        if (anchorFlag) {
            anchorText.append(new java.lang.String(ch, start, length));
        }
    }
}