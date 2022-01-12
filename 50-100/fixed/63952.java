public void requestChangesToCloud(java.io.File file, java.util.List<address.model.Person> data, int delay) throws javax.xml.bind.JAXBException {
    address.util.XmlHelper.saveToFile(file, data);
    try {
        java.util.concurrent.TimeUnit.SECONDS.sleep(delay);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}