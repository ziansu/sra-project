@org.junit.Test
public void testRetrievingNonExistentContactsById() {
    spec.ContactManager contactManager = new impl.ContactManagerImpl();
    int contactId1 = contactManager.addNewContact("John", "A note about John");
    try {
        java.util.Set<spec.Contact> contactsById = contactManager.getContacts(contactId1, 999, 1230);
    } catch (java.lang.IllegalArgumentException e) {
        org.junit.Assert.assertEquals(e.getMessage(), "Attempting to retrieve non-existent contact(s)");
    }
}