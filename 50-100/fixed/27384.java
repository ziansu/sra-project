public static javax.xml.bind.JAXBElement<org.openarchives.beans.OAIPMHtype> getElement(java.net.HttpURLConnection c) throws java.io.IOException, javax.xml.bind.JAXBException {
    javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(org.openarchives.beans.OAIPMHtype.class, org.openarchives.beans.ObjectFactory.class);
    javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    javax.xml.transform.stream.StreamSource streamSource = new javax.xml.transform.stream.StreamSource(new java.io.BufferedInputStream(c.getInputStream()));
    return jaxbUnmarshaller.unmarshal(streamSource, org.openarchives.beans.OAIPMHtype.class);
}