public static void main(java.lang.String[] args) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    org.apache.log4j.PropertyConfigurator.configure("log4j.properties");
    boolean ok = tbx2rdf.Main.parseParams(args);
    if (!ok) {
        return ;
    }
    tbx2rdf.Main.logger.info((("Using mapping file: " + (tbx2rdf.Main.mapping_file)) + "\n"));
    tbx2rdf.Main.mappings = tbx2rdf.Mappings.readInMappings(tbx2rdf.Main.mapping_file);
    if (tbx2rdf.Main.big) {
        tbx2rdf.Main.convertBigFile();
    }else {
        tbx2rdf.Main.convertSmallFile();
    }
}