@java.lang.Override
public void addContact(org.hsrt.mc.emergency.user.Contact contact) {
    if ((contacts.size()) < 3) {
        if ((contacts.size()) == 0) {
            if (userDAO.insertContactIntoDatabase(contact)) {
                this.contacts.add(contact);
            }
        }else {
            if (userDAO.insertContactIntoDatabase(contact)) {
                this.contacts.add(contact);
            }
        }
    }else {
    }
}