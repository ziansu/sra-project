public static <T> void serialize(T object, java.io.OutputStream resultStream) throws javax.xml.bind.JAXBException {
    javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(object.getClass());
    javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
    jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
    jaxbMarshaller.marshal(object, resultStream);
}