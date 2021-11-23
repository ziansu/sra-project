@java.lang.Override
public void run() {
    new com.recoverrelax.pt.riotxmppchat.MyUtil.AppUtils.MessageNotification(this.getActivity(), message.getBody(), username, userXmppAddress, MessageNotification.NotificationType.SNACKBAR).sendNotification();
}