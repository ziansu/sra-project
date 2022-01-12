private java.lang.String getSubCommandDescriptions(net.minecraft.command.ICommandSender sender) {
    final java.lang.StringBuilder builder = new java.lang.StringBuilder(net.minecraft.client.resources.I18n.format(this.getUsage(sender)));
    for (final net.minecraft.command.ICommand command : this.getSubCommands()) {
        builder.append((("\n" + (com.mojang.realmsclient.gui.ChatFormatting.GREEN)) + (net.minecraft.client.resources.I18n.format(command.getUsage(sender)))));
    }
    return builder.toString();
}