private static void createFileIfMissing(java.lang.String filePath) {
    final java.io.File storageFile = new java.io.File(filePath);
    if (storageFile.exists()) {
        return ;
    }else {
        seedu.addressbook.AddressBook.showToUser(java.lang.String.format(seedu.addressbook.AddressBook.MESSAGE_ERROR_MISSING_STORAGE_FILE, filePath));
        try {
            storageFile.createNewFile();
            seedu.addressbook.AddressBook.showToUser(java.lang.String.format(seedu.addressbook.AddressBook.MESSAGE_STORAGE_FILE_CREATED, filePath));
        } catch (java.io.IOException ioe) {
            seedu.addressbook.AddressBook.showToUser(java.lang.String.format(seedu.addressbook.AddressBook.MESSAGE_ERROR_CREATING_STORAGE_FILE, filePath));
            seedu.addressbook.AddressBook.exitProgram();
        }
    }
}