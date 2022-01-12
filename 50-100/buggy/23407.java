private void addContact() {
    com.noandroid.familycontacts.model.Contact contact = new com.noandroid.familycontacts.model.Contact(null, "Wang Liu", "Grandpa", "");
    contactDao.insert(contact);
    android.util.Log.d("Model", ("Inserted new Contact, ID: " + (contact.getId())));
    updateListContent();
}