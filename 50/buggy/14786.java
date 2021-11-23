private void DeleteContact() {
    java.lang.String contactId = getIntent().getExtras().getString("_id");
    if (contactId != null) {
        edu.umn.contactview.ContactManager contactMgr = edu.umn.contactview.ContactManager.getInstance(this);
        contactMgr.DeleteContact(contactId);
    }
}