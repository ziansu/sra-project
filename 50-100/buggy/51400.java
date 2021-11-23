@java.lang.Override
public boolean addContact(com.tempest.moonlight.server.domain.contacts.GenericContact contact) {
    com.tempest.moonlight.server.domain.contacts.GenericContact inverted = contact.invert();
    if ((contactsDAO.exists(contact)) || (contactsDAO.exists(inverted))) {
        contactsDAO.save(contact);
        contactsDAO.save(inverted);
        return true;
    }
    return false;
}