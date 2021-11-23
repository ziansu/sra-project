public static void registerCommands() {
    if (io.discloader.discloader.client.command.Command.defaultCommands) {
        io.discloader.discloader.client.command.Command.commands.addObject(0, "help", new io.discloader.discloader.client.command.CommandHelp().setUnlocalizedName("help").setId(0));
        io.discloader.discloader.client.command.Command.commands.addObject(1, "mods", new io.discloader.discloader.client.command.CommandMods().setId(1));
        io.discloader.discloader.client.command.Command.commands.addObject(2, "invite", new io.discloader.discloader.client.command.CommandInvite().setId(2));
        io.discloader.discloader.client.command.Command.commands.addObject(3, "info", new io.discloader.discloader.client.command.CommandInfo().setId(3));
    }
}