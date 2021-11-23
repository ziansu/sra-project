public void addCookie(java.lang.String user, java.lang.String cookieName, java.lang.String cookieValue) {
    android.content.ContentValues sql = new android.content.ContentValues();
    sql.put(com.michael.database.CookieTable.COLUMN_USER, user);
    sql.put(com.michael.database.CookieTable.COLUMN_NAME, cookieName);
    sql.put(com.michael.database.CookieTable.COLUMN_COOKIE, cookieValue);
    open();
    database.insert(com.michael.database.CookieTable.TABLE, null, sql);
    close();
}