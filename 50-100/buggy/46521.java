public void addContact(java.lang.String name, java.lang.String address, java.lang.String phone) {
    java.util.ArrayList<model.Contact> contactList = this.getContacts();
    model.Contact newContact = new model.Contact(name, address, phone);
    contactList.add(newContact);
    this.saveContacts(contactList);
}