private void selectConversation(javafx.scene.input.MouseEvent e) {
    int index = conversations.getSelectionModel().getSelectedIndex();
    java.lang.String data = conversations.getSelectionModel().getSelectedItem();
    codeu.chat.common.ConversationSummary selectedConvo = lookupByTitle(data, index);
    if (selectedConvo != null) {
        codeu.chat.client.simplegui.ChatGuiFX.clientContext.conversation.setCurrent(selectedConvo);
        updateCurrentConversation(selectedConvo);
    }
}