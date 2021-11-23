@java.lang.Override
public void chatMessage() {
    super.chatMessage();
    if ((adapter) != null) {
        java.util.List<de.tubs.androidlab.instameet.ui.chat.ChatMessageProxy> message = this.service.getNewMessages(friendID);
        for (de.tubs.androidlab.instameet.ui.chat.ChatMessageProxy chatMessage : message) {
            adapter.addMessage(chatMessage);
        }
    }
}