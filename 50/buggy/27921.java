public java.util.List<ch.imedias.rsccfx.model.xml.Supporter> getDefaultSupporters() {
    ch.imedias.rsccfx.model.xml.SupporterHelper.LOGGER.info("Loading default supporter list");
    java.io.File supportersXmlFile = new java.io.File(getClass().getClassLoader().getResource(ch.imedias.rsccfx.model.xml.SupporterHelper.DEFAULT_SUPPORTERS_FILENAME).toExternalForm());
    return getSupportersFromXml(supportersXmlFile);
}