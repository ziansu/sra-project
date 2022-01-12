@java.lang.Override
public void changeCursor(int partitionIndex, android.database.Cursor cursor) {
    super.changeCursor(partitionIndex, cursor);
    if ((cursor != null) && ((cursor.getCount()) > 0)) {
        cursor.moveToFirst();
        setProfileExists(((cursor.getInt(com.android.contacts.common.list.ContactListAdapter.ContactQuery.CONTACT_IS_USER_PROFILE)) == 1));
    }
}