public boolean login(java.lang.String uid, java.lang.String pw) {
    try (ur.disorderapp.database.DatabaseCursorWrapper wrapper = queryAccount("UID=?", new java.lang.String[]{ uid })) {
        wrapper.moveToFirst();
        java.lang.String password = wrapper.getPassword();
        if (password == null) {
            return false;
        }
        if (password.equals(pw)) {
            return true;
        }
        wrapper.moveToNext();
    }
    return false;
}