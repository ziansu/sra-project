private void addContact() {
    com.noandroid.familycontacts.Contact contact = new com.noandroid.familycontacts.Contact(null, "Siyuan Liu", "Dad");
    contactDao.insert(contact);
    android.util.Log.d("Model", ("Inserted new Contact, ID: " + (contact.getId())));
    updateListContent();
}