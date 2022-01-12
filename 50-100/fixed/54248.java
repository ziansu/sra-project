@java.lang.Override
public void sendErrorTo(java.util.Collection<org.bukkit.command.CommandSender> targets) {
    java.lang.String tag = tags.getTag(false, true);
    for (java.lang.String line : message) {
        for (org.bukkit.command.CommandSender target : targets) {
            target.sendMessage(tag.concat(line));
        }
    }
}