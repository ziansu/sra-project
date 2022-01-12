@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    if ((stringBuffer) != null)
        stringBuffer.append(ch, start, length);
    
}