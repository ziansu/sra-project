@java.lang.SuppressWarnings(value = "unused")
public void onEvent(support.im.events.InvitationEvent event) {
    support.im.leanclound.contacts.AddRequestManager.getInstance().unreadRequestsIncrement();
    updateNewRequestBadge();
}