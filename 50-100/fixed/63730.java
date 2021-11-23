public static java.util.Map<java.lang.String, java.lang.String> getRenderingControlFromXML(java.lang.String xml) {
    org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.RenderingControlEventHandler handler = new org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.RenderingControlEventHandler();
    try {
        org.xml.sax.XMLReader reader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader();
        reader.setContentHandler(handler);
        reader.parse(new org.xml.sax.InputSource(new java.io.StringReader(xml)));
    } catch (java.io.IOException e) {
        org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.logger.error("Could not parse Rendering Control from string '{}'", xml);
    } catch (org.xml.sax.SAXException s) {
        org.eclipse.smarthome.binding.sonos.internal.SonosXMLParser.logger.error("Could not parse Rendering Control from string '{}'", xml);
    }
    return handler.getChanges();
}