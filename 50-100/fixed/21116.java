@java.lang.Override
public void OnNewMessageNotification(final org.jivesoftware.smack.packet.Message message, final java.lang.String userXmppAddress) {
    getActivity().invalidateOptionsMenu();
    final java.lang.String username = com.recoverrelax.pt.riotxmppchat.MainApplication.getInstance().getRiotXmppService().getRoster().getEntry(userXmppAddress).getName();
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            new com.recoverrelax.pt.riotxmppchat.MyUtil.AppUtils.MessageNotification(com.recoverrelax.pt.riotxmppchat.ui.fragment.FriendListFragment.this.getActivity(), message.getBody(), username, userXmppAddress, MessageNotification.NotificationType.SNACKBAR);
        }
    });
}