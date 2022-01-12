public void removeConversationInterest(java.lang.String title) {
    codeu.chat.client.core.Controller ContextController = ((codeu.chat.client.core.Controller) (controller));
    ContextController.removeConversationInterest(title, user.id);
}