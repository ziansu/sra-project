@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> cursorLoader, android.database.Cursor cursor) {
    java.util.List<java.lang.String> emails = new java.util.ArrayList<>();
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        emails.add(cursor.getString(com.example.alex.qtapandroid.activities.LoginActivity.ProfileQuery.ADDRESS));
        cursor.moveToNext();
    } 
    addEmailsToAutoComplete(emails);
}