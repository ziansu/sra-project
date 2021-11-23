@java.lang.Override
public void endElement(final java.lang.String uri, final java.lang.String localName, final java.lang.String qName) throws org.xml.sax.SAXException {
    if (((com.beimin.eveapi.handler.corporation.ELEMENT_ROWSET.equals(qName)) && (oldRoles)) || (newRoles)) {
        oldRoles = false;
        newRoles = false;
    }
}