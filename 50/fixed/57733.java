public boolean isInDatabase() throws java.sql.SQLException {
    return this.equals(data.DatabaseConnector.get(data.UserInfo.class, data.UserInfo.PHONE_FIELD_NAME, this.getPhone()).get(0));
}