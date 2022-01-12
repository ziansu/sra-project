private java.lang.String getContactName(android.database.Cursor contactLookupCursor) {
    java.lang.String name = null;
    if ((null != contactLookupCursor) && (contactLookupCursor.moveToFirst())) {
        name = contactLookupCursor.getString(contactLookupCursor.getColumnIndexOrThrow(ContactsContract.PhoneLookup.DISPLAY_NAME));
    }
    return name;
}