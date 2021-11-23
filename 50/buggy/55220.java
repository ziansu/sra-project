@org.androidannotations.annotations.AfterViews
void init() {
    if (com.orion.alixk.contacts.frontend.ContactListActivity.contacts.isEmpty()) {
        contactServiceRequest.establishConnection();
    }else {
        populateContactsList(com.orion.alixk.contacts.frontend.ContactListActivity.contacts);
    }
}