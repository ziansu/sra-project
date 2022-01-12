@org.androidannotations.annotations.AfterViews
void init() {
    if ((com.orion.alixk.contacts.frontend.ContactListActivity.contacts) == null) {
        contactServiceRequest.establishConnection();
    }else {
        populateContactsList(com.orion.alixk.contacts.frontend.ContactListActivity.contacts);
    }
}