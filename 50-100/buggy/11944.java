@java.lang.Override
public void sendToPlayers(java.util.Collection<org.bukkit.entity.Player> targets) {
    java.lang.String tag = tags.getTag(false, false);
    for (java.lang.String line : message) {
        java.lang.String messageLine = tag.concat(line);
        for (org.bukkit.command.CommandSender target : targets) {
            target.sendMessage(line);
        }
    }
}