@java.lang.Override
public void run() {
    if (user != null) {
        java.lang.String currGroupName = removeUserFromGroup(user);
        if ((currGroupName != null) || (groupName != null)) {
            addUserInGroup(user, (groupName == null ? currGroupName : groupName));
        }
    }
}