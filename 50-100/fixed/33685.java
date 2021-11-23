public void onClick(android.view.View v) {
    org.ramonaza.officialramonapp.datafiles.condrive_database.ConDriveDatabaseHelper dbHelper = new org.ramonaza.officialramonapp.datafiles.condrive_database.ConDriveDatabaseHelper(getActivity());
    android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
    android.content.ContentValues updateVals = new android.content.ContentValues();
    updateVals.put(ConDriveDatabaseContract.ContactListTable.COLUMN_PRESENT, 0);
    java.lang.String[] idArg = new java.lang.String[]{ "" + (mContact.getId()) };
    db.update(ConDriveDatabaseContract.ContactListTable.TABLE_NAME, updateVals, ((ConDriveDatabaseContract.ContactListTable.COLUMN_CONTACT_ID) + "=?"), idArg);
    refreshData();
}