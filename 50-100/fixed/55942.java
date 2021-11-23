@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    if (readPositionsArray) {
        positionsArray.add(java.lang.String.copyValueOf(ch, start, length));
    }else
        if (readNormalsArray) {
            normalsArray.add(java.lang.String.copyValueOf(ch, start, length));
        }
    
}