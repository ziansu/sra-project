public static de.konnekting.xml.schema.konnekting.KONNEKTING readConfiguration(java.io.File f) throws javax.xml.bind.JAXBException, org.xml.sax.SAXException {
    return de.konnekting.xmlschema.KonnektingXmlService.unmarshal(f.getAbsolutePath(), de.konnekting.xml.schema.konnekting.KONNEKTING.class);
}