public static <T> void serialize(T object, java.lang.Class<T> sourceClass, java.io.OutputStream resultStream) throws javax.xml.bind.JAXBException {
    javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(sourceClass);
    javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
    jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
    jaxbMarshaller.marshal(object, resultStream);
}