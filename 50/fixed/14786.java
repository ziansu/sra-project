private void DeleteContact() {
    if ((contactId) != null) {
        edu.umn.contactview.ContactManager contactMgr = edu.umn.contactview.ContactManager.getInstance(this);
        contactMgr.DeleteContact(contactId);
    }
}