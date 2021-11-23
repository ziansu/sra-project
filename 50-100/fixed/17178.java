@org.junit.Test
public void retrieveAllContactsTest() throws java.lang.InterruptedException {
    testActor.retrieveContacts();
    actorThread.join();
    org.junit.Assert.assertTrue(contacts.getContacts().containsAll(receivedContacts));
    org.junit.Assert.assertTrue(receivedContacts.containsAll(contacts.getContacts()));
}