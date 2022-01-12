public boolean updateContact(java.lang.String detail) {
    crud.core.model.Contact contact = contactOps.contact;
    person.getContacts().remove(contact);
    contactOps.setDetail(detail);
    contact = contactOps.contact;
    if (contactExist(contact))
        return false;
    else {
        person.getContacts().add(contact);
        contactOps.update();
    }
    return true;
}