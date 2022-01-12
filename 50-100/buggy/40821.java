public boolean getEmailEntry(java.lang.String email) {
    android.database.Cursor cursor = db.query("LOGIN", null, " EMAIL=?", new java.lang.String[]{ email }, null, null, null);
    if ((cursor.getCount()) < 1) {
        cursor.close();
        return false;
    }else {
        return true;
    }
}