@org.junit.Test
public void retrieveSingleContactTest() throws java.lang.InterruptedException {
    de.qabel.core.config.Contact testContactRetrieveSingle = contactFactory.create();
    contacts.add(testContactRetrieveSingle);
    java.lang.Thread actorThread = new java.lang.Thread(testActor);
    actorThread.start();
    testActor.retrieveContacts(testContactRetrieveSingle.getKeyIdentifier());
    actorThread.join();
    org.junit.Assert.assertEquals(1, receivedContacts.size());
    org.junit.Assert.assertTrue(receivedContacts.contains(testContactRetrieveSingle));
}