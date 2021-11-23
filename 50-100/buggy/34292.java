public static void addFriend(model.User user, java.lang.String username) {
    int first = user.getUserID();
    int second = Servlets.DBHelper.findUser(username).getUserID();
    Servlets.DBHelper.makeFriends(first, second);
    Servlets.DBHelper.sendRequest(first, second);
}