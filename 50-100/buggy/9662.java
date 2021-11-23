public void stringToAllOtherUsers(User author, java.lang.String s) {
    Logger.logString(s);
    for (User u : users) {
        if (!(u.getName().equalsIgnoreCase(author.getName()))) {
            u.writeString(s);
        }
    }
}