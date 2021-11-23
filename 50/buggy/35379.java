public static void sendChatMessage(net.minecraft.entity.player.EntityPlayer player, java.lang.String msg, net.minecraft.util.text.TextFormatting color) {
    net.minecraft.util.text.TextComponentTranslation chatComponent = new net.minecraft.util.text.TextComponentTranslation(msg);
    chatComponent.getStyle().setColor(color);
    player.sendMessage(chatComponent);
}