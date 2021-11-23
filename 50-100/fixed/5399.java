@java.lang.Override
public void onChat(net.minecraft.util.text.ITextComponent chat, java.lang.String message) {
    java.lang.String newMessage = message.replace(java.lang.String.valueOf(ChatColor.COLOR_CHAR), "&").replace("&r", "");
    chat.getStyle().setClickEvent(new net.minecraft.util.text.event.ClickEvent(net.minecraft.util.text.event.ClickEvent.Action.RUN_COMMAND, ("/cm copy " + newMessage)));
    if (io.github.fridgey.chatmacros.util.ChatUtil.parseChat(message.replace(ChatColor.RESET.toString(), "")).isPresent()) {
        mainOverview.addChatLine(newMessage);
    }
}