@org.junit.Test
public void removeSingleContactTest() throws java.lang.InterruptedException {
    de.qabel.core.config.Contact testContactRemoveSingle = contactFactory.create();
    testActor.removeContacts(testContactRemoveSingle.getKeyIdentifier());
    actorThread.join();
    org.junit.Assert.assertFalse(contacts.getContacts().contains(testContactRemoveSingle));
}