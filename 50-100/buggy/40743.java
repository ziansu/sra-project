public static misc.Settings loadSettings(java.lang.String filename) {
    misc.Settings settings = null;
    try {
        javax.xml.bind.JAXBContext jc = javax.xml.bind.JAXBContext.newInstance(misc.Settings.class);
        javax.xml.bind.Unmarshaller unmarshaller = jc.createUnmarshaller();
        settings = ((misc.Settings) (unmarshaller.unmarshal(new java.io.FileInputStream(new java.io.File(filename)))));
        GlobalObjects.logger.addLog("Successfully parsed Settings.");
    } catch (java.lang.Exception e) {
        GlobalObjects.errorLogger.logError(e);
        settings = new misc.Settings();
    }
    return settings;
}