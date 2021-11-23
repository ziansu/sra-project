private static void setupGivenFileForStorage(java.lang.String filePath) {
    if (!(seedu.addressbook.AddressBook.isValidFilePath(filePath))) {
        seedu.addressbook.AddressBook.showToUser(java.lang.String.format(seedu.addressbook.AddressBook.MESSAGE_INVALID_FILE, filePath));
        seedu.addressbook.AddressBook.exitProgram();
    }
    seedu.addressbook.AddressBook.storageFilePath = filePath;
    seedu.addressbook.AddressBook.createFileIfMissing(filePath);
}