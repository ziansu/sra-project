private java.lang.String getSubCommandDescriptions(net.minecraft.command.ICommandSender sender) {
    final java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (final net.minecraft.command.ICommand command : this.getSubCommands()) {
        builder.append(("\n" + (command.getUsage(sender))));
    }
    return builder.toString();
}