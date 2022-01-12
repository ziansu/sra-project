private android.database.Cursor addParticipantToCursor(android.database.Cursor data, java.lang.String uid) {
    android.database.Cursor uidCursor = com.usal.jorgeav.sportapp.MyApplication.getAppContext().getContentResolver().query(SportteamContract.UserEntry.CONTENT_USER_URI, SportteamContract.UserEntry.USER_COLUMNS, ((SportteamContract.UserEntry.USER_ID) + " = ? "), new java.lang.String[]{ uid }, null);
    return new android.database.MergeCursor(new android.database.Cursor[]{ uidCursor , data });
}