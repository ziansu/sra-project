public io.github.likcoras.asuka.handler.response.BotResponse update(org.pircbotx.hooks.types.GenericMessageEvent<org.pircbotx.PircBotX> event) throws java.io.IOException, javax.xml.stream.XMLStreamException {
    new java.net.URL(io.github.likcoras.asuka.handler.SilentSkyXMLHandler.UPDATE_LINK).openConnection().connect();
    javax.xml.stream.XMLStreamReader xmlReader = javax.xml.stream.XMLInputFactory.newFactory().createXMLStreamReader(new java.net.URL(io.github.likcoras.asuka.handler.SilentSkyXMLHandler.XML_LINK).openStream());
    synchronized(xmlData) {
        xmlData.clear();
        xmlData.putAll(parseData(xmlReader));
    }
    return new io.github.likcoras.asuka.handler.response.SilentSkyXMLUpdateResponse(event);
}