@java.lang.Override
public void sendMessageInternal(java.lang.String message) {
    sender.sendMessage(new net.md_5.bungee.api.chat.TextComponent(co.aikar.commands.ACFBungeeUtil.color(message)));
}