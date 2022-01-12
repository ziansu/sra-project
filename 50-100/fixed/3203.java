public address.sync.model.CloudAddressBook readCloudAddressBookFromFile(java.lang.String addressBookName) throws javax.xml.bind.JAXBException {
    java.io.File cloudFile = getCloudDataFilePath(addressBookName);
    java.lang.System.out.println(("Reading from cloudFile: " + (cloudFile.canRead())));
    try {
        return address.util.XmlUtil.getDataFromFile(cloudFile, address.sync.model.CloudAddressBook.class);
    } catch (javax.xml.bind.JAXBException e) {
        java.lang.System.out.println("Error reading from cloud file.");
        throw e;
    }
}