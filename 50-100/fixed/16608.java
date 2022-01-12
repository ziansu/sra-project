@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    super.endElement(uri, localName, qName);
    if (localName.equalsIgnoreCase("ride")) {
        curEntry.setNotes(notes.toString().trim());
        rides.add(curEntry);
    }
    this.notes.setLength(0);
}