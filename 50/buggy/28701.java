private void readHGNCXML() {
    java.lang.ClassLoader cl = getClass().getClassLoader();
    java.io.InputStream HGNC_XML_RES = cl.getResourceAsStream("org/xmlcml/ami2/plugins/gene/hgnc/hgnc.xml");
    org.xmlcml.ami2.dictionary.gene.HGNCDictionary.LOG.debug(("hgnc xml res: " + HGNC_XML_RES));
    readDictionary(HGNC_XML_RES);
}