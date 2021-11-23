public void addNewContact(common.ContactInformation info) {
    openSession();
    org.hibernate.Transaction tx = ContactManager.session.beginTransaction();
    try {
        ContactManager.session.save(info);
        tx.commit();
    } catch (java.lang.Exception E) {
        java.lang.System.out.println(("Caught error: " + (E.getMessage())));
        tx.rollback();
    } finally {
        displayEntries();
        closeSession();
    }
}