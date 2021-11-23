@org.junit.Test
public void testMarshallingJFeedWithJaxbElement() throws java.io.IOException, javax.xml.bind.JAXBException {
    checkXml(jaxbElementFeed);
    checkJson(jaxbElementFeed, new com.fasterxml.jackson.core.type.TypeReference<be.wegenenverkeer.atomium.japi.format.Feed<java.lang.Integer>>() {    });
}