@java.lang.Override
public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    switch (qName) {
        case "roboUnit" :
            currentId = attributes.getValue("id");
            break;
        case com.robo4j.core.configuration.XmlConfigurationFactory.ELEMENT_CONFIG :
            currentConfiguration = "";
            configState = true;
            break;
    }
    lastElement = qName;
    if (configState) {
        currentConfiguration += java.lang.String.format("<%s %s>", qName, toString(attributes));
    }
}