public pt.lsts.neptus.plugins.mvplanning.jaxb.Profile unmarshal(java.lang.String type) {
    javax.xml.bind.JAXBContext jaxbContext;
    javax.xml.bind.Unmarshaller jaxbUnmarshaller;
    pt.lsts.neptus.plugins.mvplanning.jaxb.Profile pProfiles;
    try {
        jaxbContext = javax.xml.bind.JAXBContext.newInstance(pt.lsts.neptus.plugins.mvplanning.jaxb.Profile.class);
        jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        pProfiles = ((pt.lsts.neptus.plugins.mvplanning.jaxb.Profile) (jaxbUnmarshaller.unmarshal(new java.io.File((((pt.lsts.neptus.plugins.mvplanning.MVPlanning.PROFILES_DIR) + type) + ".xml")))));
        return pProfiles;
    } catch (javax.xml.bind.JAXBException e) {
        e.printStackTrace();
    }
    return new pt.lsts.neptus.plugins.mvplanning.jaxb.Profile();
}