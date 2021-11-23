@org.junit.Test
public void retrieveSingleContactTest() throws java.lang.InterruptedException {
    de.qabel.core.config.Contact testContactRetrieveSingle = contactFactory.create();
    contacts.add(testContactRetrieveSingle);
    testActor.retrieveContacts(testContactRetrieveSingle.getKeyIdentifier());
    actorThread.join();
    org.junit.Assert.assertEquals(1, receivedContacts.size());
    org.junit.Assert.assertTrue(receivedContacts.contains(testContactRetrieveSingle));
}