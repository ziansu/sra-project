private com.bsuir.piskun.beans.User setUser(com.bsuir.piskun.beans.User user, java.sql.ResultSet resultSet) throws java.sql.SQLException {
    user.setUserId(resultSet.getInt(RowValues.ID));
    user.setLogin(resultSet.getString(RowValues.LOGIN));
    user.setPassword(resultSet.getString(RowValues.PASSWORD));
    user.setRank(resultSet.getInt(RowValues.RANK));
    return user;
}