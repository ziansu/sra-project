public static void addToContacts(java.lang.String name) {
    java.lang.String userName = controllers.Security.connected();
    ch.unibe.ese.calendar.User user = ch.unibe.ese.calendar.UserManager.getInstance().getUserByName(userName);
    ch.unibe.ese.calendar.User userToAdd = ch.unibe.ese.calendar.UserManager.getInstance().getUserByName(name);
    user.addToMyContacts(userToAdd);
    controllers.Application.calendar(name, null);
}