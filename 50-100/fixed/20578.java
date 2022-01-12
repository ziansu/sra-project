public void saveUser(week04.app.User user) throws week04.data.AtmDataException {
    java.util.Calendar now = java.util.Calendar.getInstance();
    java.sql.Date updateDate = new java.sql.Date(now.getTime().getTime());
    if ((user.getUserId()) == (-1)) {
        insertUser(user, updateDate);
    }else {
        updateUser(user, updateDate);
    }
}