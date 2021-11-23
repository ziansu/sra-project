@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    android.database.Cursor cursor = ((android.database.Cursor) (adapterView.getItemAtPosition(position)));
    if (cursor != null) {
        ((it.jaschke.alexandria.api.Callback) (getActivity())).onItemSelected(cursor.getString(cursor.getColumnIndex(AlexandriaContract.BookEntry._ID)));
    }
}