public void removeConversation(com.tanndev.subwave.client.ui.gui.ConversationElement conversation) {
    if (conversation == null)
        return ;
    
    java.lang.String cardName = buildCardName(conversation);
    com.tanndev.subwave.client.ui.gui.ChatCard chatCard = cardMap.get(cardName);
    if (chatCard == null)
        return ;
    
    remove(chatCard);
    cardLayout.show(this, com.tanndev.subwave.client.ui.gui.ChatPanel.BLANK_CARD_NAME);
    displayedConversation = null;
    parentUI.repaint();
}