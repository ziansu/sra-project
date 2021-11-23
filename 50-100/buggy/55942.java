@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    if (readPositionsArray) {
        positionsArray = java.lang.String.copyValueOf(ch, start, length);
    }else
        if (readNormalsArray) {
            normalsArray = java.lang.String.copyValueOf(ch, start, length);
        }
    
}