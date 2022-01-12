@java.lang.Override
public void sendErrorToPlayers(org.bukkit.entity.Player[] targets) {
    java.lang.String tag = tags.getTag(false, true);
    for (java.lang.String line : message) {
        for (org.bukkit.command.CommandSender target : targets) {
            target.sendMessage(tag.concat(line));
        }
    }
}