public static void addChatMessage(net.minecraft.command.ICommandSender sender, java.lang.String string) {
    sender.addChatMessage(new net.minecraft.util.text.TextComponentTranslation(net.minecraft.client.resources.I18n.format(string)));
}