private void marshall(com.helpme.app.saveload.SaveRoot saveRoot, java.lang.String filePath) throws javax.xml.bind.JAXBException {
    java.io.File file = new java.io.File(filePath);
    marshaller.marshal(saveRoot, file);
}