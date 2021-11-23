@java.lang.Override
public void processCommand(net.minecraft.command.ICommandSender sender, java.lang.String[] args) throws net.minecraft.command.CommandException {
    try {
        command.execute(server, sender, new org.squiddev.cctweaks.core.command.CommandContext(command), java.util.Arrays.asList(args));
    } catch (net.minecraft.command.CommandException e) {
        throw e;
    } catch (java.lang.Throwable e) {
        org.squiddev.cctweaks.core.utils.DebugLogger.debug("Unhandled exception in command", e);
        throw new net.minecraft.command.CommandException(("Unhandled exception: " + (e.toString())));
    }
}