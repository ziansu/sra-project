private static java.util.SortedMap<java.lang.String, java.lang.String> loadXmlFile(java.lang.String filename) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    java.io.InputStream in = cmri.utils.configuration.ConfigFileManager.getResourceFile(filename);
    if (in == null) {
        return cmri.utils.configuration.ConfigManager.paras;
    }
    return new cmri.utils.configuration.XmlConfigFile(in).getProperties();
}