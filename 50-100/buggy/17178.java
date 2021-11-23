@org.junit.Test
public void retrieveAllContactsTest() throws java.lang.InterruptedException {
    java.lang.Thread actorThread = new java.lang.Thread(testActor);
    actorThread.start();
    testActor.retrieveContacts();
    actorThread.join();
    org.junit.Assert.assertTrue(contacts.getContacts().containsAll(receivedContacts));
    org.junit.Assert.assertTrue(receivedContacts.containsAll(contacts.getContacts()));
}