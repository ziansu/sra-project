@java.lang.Override
public void execute(org.bukkit.command.CommandSender sender, java.util.Map<java.lang.String, java.lang.Object> arguments) throws name.richardson.james.bukkit.util.command.CommandPermissionException, name.richardson.james.bukkit.util.command.CommandUsageException {
    if (plugin.isTimersStarted()) {
        throw new name.richardson.james.bukkit.util.command.CommandUsageException("Timers have already been started!");
    }else {
        final int delay = ((java.lang.Integer) (arguments.get("delay")));
        plugin.startTimers(delay);
        sender.sendMessage(java.lang.String.format(((org.bukkit.ChatColor.GREEN) + "Timers started with an inital %d second delay."), ((name.richardson.james.bukkit.timedmessages.TimedMessages.START_DELAY) / 20)));
    }
}