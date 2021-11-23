@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    android.database.Cursor cursor = cursorAdapter.getCursor();
    if (cursor != null) {
        cursor.moveToPosition(position);
        new cz.metaverse.android.bilingualreader.dialog.AddToSRSDialog(true, id, cursor.getString(1), cursor.getString(2)).show(getFragmentManager(), "add_to_srs_dialog");
    }
}