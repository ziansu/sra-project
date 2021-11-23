@java.lang.Override
public net.sharksystem.sharknet.api.Chat newChat(java.util.List<net.sharksystem.sharknet.api.Contact> recipients, net.sharksystem.sharknet.api.Contact sender) {
    if ((myProfile) == null)
        return null;
    
    net.sharksystem.sharknet.api.Chat chat = new net.sharksystem.sharknet.api.ImplChat(recipients, sender, myProfile);
    chat_list.add(chat);
    return chat;
}