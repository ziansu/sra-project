public void onLoaderReset(android.content.Loader<android.database.Cursor> arg0) {
    if ((householdDialog) != null)
        householdDialog.dismiss();
    
    householdDialog = null;
}