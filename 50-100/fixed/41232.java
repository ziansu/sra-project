void nextTagBody(org.xmlpull.v1.XmlPullParser reader) throws java.lang.Exception {
    int event = reader.getEventType();
    while (event != (org.xmlpull.v1.XmlPullParser.END_DOCUMENT)) {
        if (event == (org.xmlpull.v1.XmlPullParser.START_TAG)) {
            final java.lang.String nodeName = reader.getName();
            if (org.fs.xml.soap.reader.SoapXMLParserFactory.SOAP_BODY.equalsIgnoreCase(nodeName)) {
                reader.next();
                reader.next();
                break;
            }
        }
        event = reader.next();
    } 
}