public void removeUser(java.lang.String user) {
    java.lang.String where = ("user LIKE \"" + user) + "\"";
    open();
    database.delete(com.michael.database.CookieTable.TABLE, where, null);
    close();
}