@java.lang.Override
public void run() {
    if (user != null) {
        java.lang.String currGroupName = removeUserFromGroup(user);
        java.lang.System.out.println(((("User " + (user.getLogin())) + " a été supprimé du groupe ") + currGroupName));
        if ((currGroupName != null) || (groupName != null)) {
            addUserInGroup(user, (groupName == null ? currGroupName : groupName));
        }
    }
}