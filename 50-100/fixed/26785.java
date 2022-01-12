public void createCloudAddressBookFile(java.lang.String addressBookName) throws address.exceptions.DataConversionException, java.io.IOException {
    java.io.File cloudFile = getCloudDataFilePath(addressBookName);
    if ((cloudFile.exists()) || (!(cloudFile.createNewFile()))) {
        throw new java.lang.IllegalArgumentException((("AddressBook '" + addressBookName) + "' already exists!"));
    }
    writeCloudAddressBookToFile(new address.sync.model.CloudAddressBook(addressBookName));
}