@java.lang.Override
public void run() {
    boolean response = IHM.utils.Dialogs.showConfirmationDialog(((sender.getLogin()) + " veut être votre ami ! Acceptez-vous sa demande ? "));
    if (response) {
        application.getIHMtoDATA().acceptUserInGroup(sender, getFriendGroup());
        moveUserToGroup(sender, Group.FRIENDS_GROUP_NAME);
    }else {
        application.getIHMtoDATA().refuseUser(sender);
    }
}