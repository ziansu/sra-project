private void selectConversation(javafx.scene.input.MouseEvent e) {
    int index = conversations.getSelectionModel().getSelectedIndex();
    java.lang.String data = conversations.getSelectionModel().getSelectedItem();
    codeu.chat.common.ConversationSummary selectedConvo = lookupByTitle(data, index);
    java.lang.System.out.println((selectedConvo != null ? "IT IS NOT NULL--------" + (selectedConvo.title) : "NEED TO HIDE++++++++++"));
    if (selectedConvo != null) {
        codeu.chat.client.simplegui.MainChatPage.clientContext.conversation.setCurrent(selectedConvo);
        updateCurrentConversation(selectedConvo);
    }
}