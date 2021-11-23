public void refreshSipContact(org.linphone.core.LinphoneFriend lf) {
    org.linphone.LinphoneContact contact = ((org.linphone.LinphoneContact) (((org.linphone.core.LinphoneFriendImpl) (lf)).getUserData()));
    if (!(sipContacts.contains(contact))) {
        sipContacts.add(contact);
    }
    java.util.Collections.sort(sipContacts);
    for (org.linphone.ContactsUpdatedListener listener : org.linphone.ContactsManager.contactsUpdatedListeners) {
        listener.onContactsUpdated();
    }
}