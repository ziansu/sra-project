public boolean removeCookie(java.lang.String cookieName, java.lang.String cookieValue) {
    java.lang.String where = (((com.michael.database.CookieTable.COLUMN_NAME) + " LIKE ?") + (com.michael.database.CookieTable.COLUMN_COOKIE)) + " LIKE ?";
    java.lang.String[] whereArgs = new java.lang.String[]{ cookieName , cookieValue };
    open();
    int result = database.delete(com.michael.database.CookieTable.TABLE, where, whereArgs);
    close();
    if (result > 0)
        return true;
    else
        return false;
    
}