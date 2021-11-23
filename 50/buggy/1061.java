@java.lang.Override
public void onPause() {
    super.onPause();
    mAdapter.setSearchedPattern(null, null, null);
    mSession.getDataHandler().removeListener(mEventsListener);
    im.vector.contacts.ContactsManager.removeListener(mContactsListener);
}