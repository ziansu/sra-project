@org.junit.Test
public void testGettingContactsViaID() {
    manager.addNewContact("c1", "notes1");
    manager.addNewContact("c2", "notes2");
    manager.addNewContact("c3", "notes3");
    java.util.Set<Contact> several = manager.getContacts(2, 1);
    assertEquals(2, several.size());
    assertTrue(hasContact(several, "c1"));
    assertTrue(hasContact(several, "c2"));
}