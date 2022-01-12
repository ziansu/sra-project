public static net.filebot.History importHistory(java.io.InputStream stream) {
    try {
        javax.xml.bind.Unmarshaller unmarshaller = javax.xml.bind.JAXBContext.newInstance(net.filebot.History.class).createUnmarshaller();
        return ((net.filebot.History) (unmarshaller.unmarshal(stream)));
    } catch (java.lang.Exception e) {
        debug.log(java.util.logging.Level.SEVERE, "Failed to read history", e);
    }
    return new net.filebot.History();
}