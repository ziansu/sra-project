public dataAccessLayer.SonarOrganisation loadOrganisation(java.lang.String filepath) {
    businessLogicLayer.setUp.Organisation result = null;
    try {
        javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(businessLogicLayer.setUp.Organisation.class);
        javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        result = ((businessLogicLayer.setUp.Organisation) (jaxbUnmarshaller.unmarshal(new java.io.File(filepath))));
    } catch (javax.xml.bind.JAXBException e) {
        e.printStackTrace();
    }
    return organisationConverter(result);
}