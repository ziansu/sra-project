private void playSoundSendMessage(net.minecraft.util.ChatComponentTranslation component, net.minecraft.entity.player.EntityPlayer target) {
    net.minecraft.client.Minecraft.getMinecraft().getSoundHandler().playSound(Ping.SOUND);
    if ((Ping.customColor) != null) {
        component.getChatStyle().setColor(Ping.customColor);
    }
    component.getChatStyle().setBold(Config.bold);
    component.getChatStyle().setItalic(Config.italic);
    component.getChatStyle().setStrikethrough(Config.strikethrough);
    component.getChatStyle().setUnderlined(Config.underline);
}