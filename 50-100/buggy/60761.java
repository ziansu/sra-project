@java.lang.Override
public void sendErrorToPlayers(java.util.Collection<org.bukkit.entity.Player> targets) {
    java.lang.String tag = tags.getTag(false, true);
    for (java.lang.String line : message) {
        java.lang.String messageLine = tag.concat(line);
        for (org.bukkit.command.CommandSender target : targets) {
            target.sendMessage(line);
        }
    }
}