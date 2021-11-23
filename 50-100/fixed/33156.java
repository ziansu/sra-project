private void saveChangesToStorageFile() {
    try {
        storageFile.saveAddressBookToFile(addressBook);
    } catch (java.io.FileNotFoundException fnfe) {
        ui.showToUser(java.lang.String.format(seedu.addressbook.MESSAGE_ERROR_MISSING_STORAGE_FILE, storageFile));
        exitProgram();
    } catch (java.io.IOException ioe) {
        ui.showToUser(java.lang.String.format(seedu.addressbook.MESSAGE_ERROR_WRITING_TO_FILE, storageFile));
        exitProgram();
    }
}