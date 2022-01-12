@java.lang.Override
public void sendMessageInternal(java.lang.String message) {
    sender.sendMessage(co.aikar.commands.ACFBungeeUtil.color(message));
}