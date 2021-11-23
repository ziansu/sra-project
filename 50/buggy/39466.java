public parsers.Article unmarshall(java.io.File xml) throws java.io.FileNotFoundException, javax.xml.bind.JAXBException {
    return ((parsers.Article) (unmarshaller.unmarshal(xml)));
}