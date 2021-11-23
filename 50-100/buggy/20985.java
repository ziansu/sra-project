public void replyToPrivateMessage(net.md_5.bungee.api.connection.ProxiedPlayer from, java.lang.String message) {
    if (!(lastMessage.containsKey(from))) {
        from.sendMessage(new net.md_5.bungee.api.chat.TextComponent(((net.md_5.bungee.api.ChatColor.RED) + "You have nobody to reply to.")));
        return ;
    }
    net.md_5.bungee.api.connection.ProxiedPlayer to = lastMessage.get(from);
    if (!(to.isConnected())) {
        from.sendMessage(new net.md_5.bungee.api.chat.TextComponent(((net.md_5.bungee.api.ChatColor.RED) + "That players is no longer online.")));
        return ;
    }
    sendPrivateMessage(from, to, message);
    return ;
}