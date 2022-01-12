public boolean reLoadContactList(android.database.sqlite.SQLiteDatabase db) {
    org.ramonaza.unofficialazaapp.people.backend.ContactCSVHandler csvHandler = (isZip) ? loadZipContactList() : loadFolderContactList();
    if (csvHandler == null)
        contactsLoaded = false;
    
    org.ramonaza.unofficialazaapp.people.backend.ContactDatabaseHandler databaseHandler = new org.ramonaza.unofficialazaapp.people.backend.ContactDatabaseHandler(db);
    for (org.ramonaza.unofficialazaapp.people.backend.ContactInfoWrapper contact : csvHandler.getCtactInfoListFromCSV())
        try {
            databaseHandler.addContact(contact);
        } catch (org.ramonaza.unofficialazaapp.people.backend.ContactDatabaseHandler contactCSVReadError) {
            contactsLoaded = false;
        }
    
    contactsLoaded = true;
    return contactsLoaded;
}