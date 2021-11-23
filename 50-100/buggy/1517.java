public boolean addUserAccount(tripplanner_server.models.UserAccount account) {
    if (account == null)
        return false;
    
    java.lang.String sql = ((((((((("INSERT INTO \"" + (schemaName)) + "\".useraccount(username, password, email, date)\tVALUES (\'") + (account.getUserName())) + "\', \'") + (account.getPassword())) + "\', \"") + (account.getEmail())) + "\', \"") + (account.getDate())) + "\');";
    return this.executeUpdate(sql);
}