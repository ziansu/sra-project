public boolean removeAll() {
    int result = database.delete(com.michael.database.CookieTable.TABLE, "1", null);
    if (result > 0)
        return true;
    else
        return false;
    
}