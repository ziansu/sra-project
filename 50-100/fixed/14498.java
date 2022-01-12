public java.util.ArrayList<java.lang.String[]> getFriends(int id) throws java.sql.SQLException {
    help = new Manager.DBHelper();
    java.lang.String firstColumnName = "first_friend_id";
    java.lang.String secondColumnName = "second_friend_id";
    java.util.ArrayList<java.lang.String[]> result = help.findByIdInTwoCollumn(tableNameFriends, firstColumnName, secondColumnName, id);
    return result;
}