private static void createFavListIfMissing(java.lang.String favListPath) {
    final java.io.File favList = new java.io.File(favListPath);
    if (!(favList.exists())) {
        seedu.addressbook.AddressBook.showToUser(java.lang.String.format(seedu.addressbook.AddressBook.MESSAGE_ERROR_MISSING_FAVLIST_FILE, favListPath));
        try {
            favList.createNewFile();
            seedu.addressbook.AddressBook.showToUser(java.lang.String.format(seedu.addressbook.AddressBook.MESSAGE_FAVLIST_FILE_CREATED, favListPath));
        } catch (java.io.IOException ioe) {
            seedu.addressbook.AddressBook.showToUser(java.lang.String.format(seedu.addressbook.AddressBook.MESSAGE_ERROR_CREATING_FAVLIST_FILE, favListPath));
            seedu.addressbook.AddressBook.exitProgram();
        }
    }
}