private boolean checkFlags(de.ecconia.bukkit.plugin.fuseport.command.FPCommand.SortedCommand sCommand, de.ecconia.bukkit.plugin.fuseport.FPPlayer player) {
    java.util.List<java.lang.String> removedFlags = sCommand.getRemovedFlags();
    if (removedFlags.isEmpty()) {
        return true;
    }
    player.feedback("feedback.command.parsing.removedflags").a(removedFlags).send();
    return false;
}