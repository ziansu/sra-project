@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    super.characters(ch, start, length);
    if (inPackageUpdate) {
        buffer.append(ch);
    }
    if (inSecurityUpdate) {
        buffer.append(ch);
    }
}