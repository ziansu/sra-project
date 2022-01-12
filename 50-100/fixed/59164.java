public void insertIntoAdmin(java.lang.String user_id, java.lang.String userName, java.lang.String pass) {
    try {
        stmt = conn.prepareStatement("insert into admin (user_id, username, date_created, pass) values (?,?,NOW(),?);");
        stmt.setString(1, user_id);
        stmt.setString(2, userName);
        stmt.setString(3, pass);
        stmt.executeUpdate();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}