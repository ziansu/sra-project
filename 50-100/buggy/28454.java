public void marshall() {
    java.lang.System.out.println("Marshalled Available Ambience");
    try {
        javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(kujiin.xml.AvailableAmbiences.class);
        javax.xml.bind.Marshaller createMarshaller = context.createMarshaller();
        createMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
        createMarshaller.marshal(this, Preferences.AVAILABLEAMBIENCEXMLFILE);
    } catch (javax.xml.bind.JAXBException ignored) {
        ignored.printStackTrace();
    }
}