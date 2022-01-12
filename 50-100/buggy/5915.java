public static void removeFromContacts(java.lang.String name) {
    java.lang.String userName = controllers.Security.connected();
    ch.unibe.ese.calendar.User user = ch.unibe.ese.calendar.UserManager.getInstance().getUserByName(userName);
    ch.unibe.ese.calendar.User userToRemove = ch.unibe.ese.calendar.UserManager.getInstance().getUserByName(name);
    try {
        user.removeFromMyContacts(userToRemove);
    } catch (javax.activity.InvalidActivityException e) {
        e.printStackTrace();
    }
    controllers.Application.calendar(name, null);
}