public java.lang.Long getLastInsertedId() {
    java.sql.Statement statement;
    java.sql.ResultSet resultSet;
    java.lang.Long lastId = 0L;
    try {
        statement = connection.createStatement();
        resultSet = statement.executeQuery(com.zhartunmatthew.web.contactbook.dao.ContactDAO.GET_LAST_ID);
        lastId = (resultSet.next()) ? resultSet.getLong("last_id") : -1;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return lastId;
}