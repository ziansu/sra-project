@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) {
    if ((counter) == 1) {
        try {
            r.addSample(currentSample);
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
        (counter)--;
    }
}