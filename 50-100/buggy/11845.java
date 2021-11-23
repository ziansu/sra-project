public void update(codeu.chat.common.ConversationSummary owningConversation) {
    final codeu.chat.common.User u = (owningConversation == null) ? null : clientContext.user.lookup(owningConversation.owner);
    messageOwnerLabel.setText(("Owner: " + (u == null ? owningConversation == null ? "" : owningConversation.owner : u.name)));
    messageConversationLabel.setText(("Conversation: " + (owningConversation.title)));
    getAllMessages(owningConversation, true);
}