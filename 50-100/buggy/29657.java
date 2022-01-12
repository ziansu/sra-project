private boolean userAlreadyExist(java.lang.String uid) {
    android.database.Cursor result = this.getContentResolver().query(PrescriptionContract.UserEntry.CONTENT_URI, new java.lang.String[]{ PrescriptionContract.UserEntry._ID }, ((PrescriptionContract.UserEntry.COLUMN_UID) + " = ?"), new java.lang.String[]{ uid }, null);
    if ((result != null) && (result.moveToFirst())) {
        com.amycui.medsminder.ui.MainActivity.mUserKey = result.getLong(result.getColumnIndex(PrescriptionContract.UserEntry._ID));
        return true;
    }
    return false;
}