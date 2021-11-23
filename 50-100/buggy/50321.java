private void loadList() throws java.io.IOException {
    try {
        devices = persistingService.getList();
        devices.sort(deviceComparator);
    } catch (javax.xml.bind.JAXBException e) {
        throw new java.io.IOException(e);
    }
    if ((devices) == null)
        devices = new java.util.ArrayList<>();
    
}