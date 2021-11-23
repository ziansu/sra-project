@java.lang.Override
public void onDeleteDialogPositiveClick(android.support.v4.app.DialogFragment dialog) {
    java.lang.String selection = (com.bladefrisch.discoveringtalk.data.EntryContract.PhraseEntry._ID) + " = ?";
    java.lang.String[] selectionArgs = new java.lang.String[]{ java.lang.String.valueOf(pId) };
    getContentResolver().delete(PhraseEntry.CONTENT_URI, selection, selectionArgs);
    android.widget.Toast.makeText(this, "Successfully deleted", Toast.LENGTH_SHORT).show();
    onStart();
}