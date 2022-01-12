public static void includeContacts(java.lang.String[] checkedContacts, java.lang.String calendarName) {
    java.lang.String userName = controllers.Security.connected();
    ch.unibe.ese.calendar.User user = ch.unibe.ese.calendar.UserManager.getInstance().getUserByName(userName);
    user.unselectAllContacts();
    if (checkedContacts != null) {
        for (java.lang.String uName : checkedContacts) {
            ch.unibe.ese.calendar.User u = ch.unibe.ese.calendar.UserManager.getInstance().getUserByName(uName);
            user.setContactSelection(u, true);
        }
    }
    controllers.Application.calendar(userName, calendarName);
}