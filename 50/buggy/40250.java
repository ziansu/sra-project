@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    progress.dismiss();
    android.widget.Toast.makeText(getApplicationContext(), "YaY", Toast.LENGTH_LONG).show();
}