@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    java.lang.String newPiece = new java.lang.String(ch, start, length);
    if ((!(newPiece.equals("\n"))) && (isRootNode))
        lastContent.append(newPiece);
    
}