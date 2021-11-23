public java.util.ArrayList<java.lang.String> getOne2OneUserNames() {
    java.util.ArrayList<java.lang.String> userNames = new java.util.ArrayList<>();
    for (int i = 0; i < (getItemCount()); i++) {
        com.firebasechatdemo.ui.model.ChatListModel chat = getItem(i);
        if (!(chat.isGroup)) {
            userNames.add(chat.chatName);
        }
    }
    return userNames;
}