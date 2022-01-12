@java.lang.Override
public void execute(org.getspout.api.command.CommandSource source, java.lang.String[] args, int baseIndex, boolean fuzzyLookup) throws org.getspout.api.command.CommandException {
    org.bukkit.Bukkit.getServer().getCommandAliases();
    args[baseIndex] = "/" + (args[baseIndex]);
    if (!(plugin.getWorldEdit().handleCommand(plugin.wrapCommandSender(source), org.getspout.api.util.MiscCompatibilityUtils.arrayCopyOfRange(args, baseIndex, args.length)))) {
        throw new org.getspout.api.command.CommandException((("Unknown command: '" + (args[baseIndex])) + "'!"));
    }
}