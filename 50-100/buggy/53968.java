@java.lang.Override
protected void prepare() throws at.bitfire.ical4android.CalendarStorageException, at.bitfire.vcard4android.ContactsStorageException {
    localCollection = new at.bitfire.davdroid.resource.LocalAddressBook(account, provider);
    at.bitfire.davdroid.resource.LocalAddressBook localAddressBook = localAddressBook();
    localAddressBook.setURL(info.url);
    android.content.ContentValues values = new android.content.ContentValues(2);
    values.put(ContactsContract.Settings.SHOULD_SYNC, 1);
    values.put(ContactsContract.Settings.UNGROUPED_VISIBLE, 1);
    localAddressBook.updateSettings(values);
    journal = new at.bitfire.davdroid.journalmanager.JournalEntryManager(httpClient, remote, info.url);
}