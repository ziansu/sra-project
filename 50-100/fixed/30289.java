@java.lang.Override
protected void initListView(android.database.Cursor messagesCursor) {
    messagesAdapter = new com.quickblox.q_municate.ui.chats.PrivateDialogMessagesAdapter(this, friendOperationAction, messagesCursor, this, dialog);
    messagesListView.setAdapter(((se.emilsjolander.stickylistheaders.StickyListHeadersAdapter) (messagesAdapter)));
    ((com.quickblox.q_municate.ui.chats.PrivateDialogMessagesAdapter) (messagesAdapter)).findLastFriendsRequestMessagesPosition();
    isNeedToScrollMessages = true;
}