public parsers.Article unmarshall(java.io.File xml) throws java.io.FileNotFoundException, javax.xml.bind.JAXBException {
    return unmarshall(new java.io.FileInputStream(xml));
}