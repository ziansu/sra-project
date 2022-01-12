public void setConfigXML(java.util.Collection<org.jdom.Element> configXML, boolean visAvailable) {
    for (org.jdom.Element element : configXML) {
        if (element.getName().equals("bitrate")) {
            RADIO_TRANSMISSION_RATE_kbps = java.lang.Double.parseDouble(element.getText());
            RADIO_TRANSMISSION_RATE_kbps = 50;
            if ((this) instanceof org.contikios.cooja.contikimote.LongRangeInterface) {
                RADIO_TRANSMISSION_RATE_kbps = 50;
            }
            org.contikios.cooja.contikimote.interfaces.ContikiRadio.logger.info(("Radio bitrate reconfigured to (kbps): " + (RADIO_TRANSMISSION_RATE_kbps)));
        }
    }
}