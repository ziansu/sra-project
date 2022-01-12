@org.junit.Test
public void testBadTwin1() throws javax.xml.bind.JAXBException, javax.xml.bind.PropertyException {
    model.Automa result = controller.getBadTwinOne(automa);
    javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(model.Automa.class);
    javax.xml.bind.Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(result, java.lang.System.out);
}