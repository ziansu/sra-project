private static void sendChatMessage(net.minecraft.entity.player.EntityPlayer player, java.lang.String msg, java.lang.Object format, net.minecraft.util.text.TextFormatting color) {
    net.minecraft.util.text.TextComponentTranslation chatComponent = new net.minecraft.util.text.TextComponentTranslation(msg, format);
    chatComponent.getStyle().setColor(color);
    player.sendMessage(chatComponent);
}