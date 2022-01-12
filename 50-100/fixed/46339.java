@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    data.moveToFirst();
    contactPhoneNumber = data.getString(data.getColumnIndex(Phone.NUMBER));
    contactName = data.getString(data.getColumnIndex(Phone.DISPLAY_NAME));
    setRecipientDetailsView();
}