@org.junit.Before
public void buildUp() {
    contactManager = new ContactManagerImpl();
    contact1 = new ContactImpl("Amelie Worth");
    contact2 = new ContactImpl("Brian Sprout");
    contact3 = new ContactImpl("Julie Miller");
    contactManager.addNewContact(contact1);
    contactManager.addNewContact(contact2);
    myContactSet = contactManager.getContacts(1, 2);
}