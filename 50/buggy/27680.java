public long getUserID(java.lang.String username, java.lang.String password) {
    helper.TimeHelper.sleep(2000);
    if (userDAO.isRegistered(username, password)) {
        return userDAO.getID(username);
    }else {
        return 0;
    }
}