@org.junit.Test
public void addMultipleContactsTest() throws java.lang.InterruptedException {
    de.qabel.core.config.Contact testContactAddMulti1 = contactFactory.create();
    de.qabel.core.config.Contact testContactAddMulti2 = contactFactory.create();
    testActor.writeContacts(testContactAddMulti1, testContactAddMulti2);
    actorThread.join();
    org.junit.Assert.assertTrue(contacts.getContacts().contains(testContactAddMulti1));
    org.junit.Assert.assertTrue(contacts.getContacts().contains(testContactAddMulti2));
}