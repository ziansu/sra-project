public static java.util.List<org.eclipse.smarthome.binding.sonos.internal.SonosAlarm> getAlarmsFromStringResult(java.lang.String xml) {
    org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.AlarmHandler handler = new org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.AlarmHandler();
    try {
        org.xml.sax.XMLReader reader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader();
        reader.setContentHandler(handler);
        reader.parse(new org.xml.sax.InputSource(new java.io.StringReader(xml)));
    } catch (java.io.IOException e) {
        org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.logger.error("Could not parse Alarms from string '{}'", xml);
    } catch (org.xml.sax.SAXException s) {
        org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.logger.error("Could not parse Alarms from string '{}'", xml);
    }
    return handler.getAlarms();
}