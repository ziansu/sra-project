@java.lang.Override
public void sendTo(org.bukkit.command.CommandSender[] targets) {
    java.lang.String tag = tags.getTag(false, false);
    for (java.lang.String line : message) {
        java.lang.String messageLine = tag.concat(line);
        for (org.bukkit.command.CommandSender target : targets) {
            target.sendMessage(line);
        }
    }
}