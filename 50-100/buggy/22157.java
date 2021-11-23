public void createCloudAddressBookFile(java.lang.String addressBookName) throws java.io.IOException, javax.xml.bind.JAXBException {
    java.io.File cloudFile = getCloudDataFilePath(addressBookName);
    if (cloudFile.exists()) {
        throw new java.lang.IllegalArgumentException((("AddressBook '" + addressBookName) + "' already exists!"));
    }
    cloudFile.createNewFile();
    writeCloudAddressBookToFile(new address.sync.model.CloudAddressBook(addressBookName));
}