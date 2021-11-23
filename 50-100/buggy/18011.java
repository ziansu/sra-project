private void refresh() {
    java.lang.System.out.println(">> > > > > REFRESH");
    actionBar.setTitle(currentConvo.nickname);
    refreshInvitePendingMessage();
    refreshChatMessages();
    sneer.convos.ChatMessage last = lastMessageReceived(currentConvo.messages);
    if (last != null)
        sneer.android.SneerAndroidFlux.dispatch(currentConvo.setRead(last));
    
    refreshSessions();
}