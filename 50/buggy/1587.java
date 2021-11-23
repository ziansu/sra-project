public com.helpme.app.saveload.SaveRoot unmarshall(java.lang.String filePath) throws javax.xml.bind.JAXBException {
    java.io.File file = new java.io.File(filePath);
    com.helpme.app.saveload.SaveRoot saveRoot = ((com.helpme.app.saveload.SaveRoot) (unmarshaller.unmarshal(file)));
    return saveRoot;
}