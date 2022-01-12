public static void addFriend(model.User user, java.lang.String username) {
    int first = user.getUserID();
    java.lang.System.out.println(first);
    int second = Servlets.DBHelper.findUser(username).getUserID();
    java.lang.System.out.println(second);
    Servlets.DBHelper.makeFriends(first, second);
    Servlets.DBHelper.sendRequest(first, second);
}